package testNGpractice;

import org.testng.annotations.Test;

public class timeOutForTestValidations {

	@Test(timeOut = 3000, expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void testMethod() {
		int i=1;
		int arr[]= {2,3,7,6,7};
		System.out.println(arr[6]);
		
		while(i==1) {
			
			System.out.println(i);
			
		}
	}
	
	@Test
	public void test() {
		
		System.out.println("Test 1");
	}
}
