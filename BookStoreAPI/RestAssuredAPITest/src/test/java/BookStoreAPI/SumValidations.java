package BookStoreAPI;

import org.testng.annotations.Test;

import Files.ComplexPayload;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

public class SumValidations {

	@Test
	public void sumOfCourses() {
		
		int sum=0;
		JsonPath js = new JsonPath(ComplexPayload.coursePayload());
		int count =js.getInt("courses.size()");
		for(int i=0;i<count;i++) {
			int coursePrice = js.getInt("courses["+i+"].price");
			int courseCopies =  js.getInt("courses["+i+"].copies");
			int amount = coursePrice*courseCopies;
//			System.out.println(amount);
			sum=sum+amount;

		}
		System.out.println(sum);
		int totalAmt=js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(totalAmt, sum);
	}
}
