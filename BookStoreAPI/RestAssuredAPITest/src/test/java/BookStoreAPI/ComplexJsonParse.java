package BookStoreAPI;

import Files.ComplexPayload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	
	public static void main(String[] args) {

	JsonPath js = new JsonPath(ComplexPayload.coursePayload());
	
	System.out.println("Print number of courses return by API");

	int count =js.getInt("courses.size()");
	System.out.println(count);
	
	System.out.println("******************************************************");
	
	System.out.println("Print Total purchase amount");
	
	int totalAmt=js.getInt("dashboard.purchaseAmount");
	System.out.println(totalAmt);
	
	System.out.println("******************************************************");
	
	System.out.println("Print Title of the first course");	
	
	String firstTitle=js.getString("courses[0].title");
	System.out.println(firstTitle);
	
	System.out.println("******************************************************");
	
	System.out.println("Print All course titles and their respective Prices");

	for(int i=0;i<count;i++) {
		
		String courseTitles=js.get("courses["+i+"].title");
		int coursePriceses= js.get("courses["+i+"].price");
		System.out.println(courseTitles + " : " + coursePriceses);
		 
	}
	
	System.out.println("******************************************************");

	System.out.println("Print no of copies sold by RPA Course");
	
for(int i=0;i<count;i++) {
		

		String courseTitles=js.get("courses["+i+"].title");
		
		if(courseTitles.equalsIgnoreCase("RPA")) {
			
			int noRPACopies = js.get("courses["+i+"].copies");
			System.out.println("Number of copies sold by RPA Course =" + noRPACopies);
			break;
		}		
		 
	}
	System.out.println("******************************************************");
	
	System.out.println("Verify if Sum of all Course prices matches with Purchase Amount");
	
	
	
	System.out.println("******************************************************");
	
	
	}
}
