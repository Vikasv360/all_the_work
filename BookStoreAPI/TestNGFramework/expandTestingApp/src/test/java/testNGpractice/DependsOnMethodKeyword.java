package testNGpractice;

import org.testng.annotations.Test;

public class DependsOnMethodKeyword {

	@Test
	public void login() {

		System.out.println("Login to APP");
		int t=9/0;
	}

	@Test(dependsOnMethods = "login")
	public void serachFun() {
		
		System.out.println("search an item after login");
	}
	
	@Test
	public void logout() {
		
		System.out.println("logout of APP");
	}
}
