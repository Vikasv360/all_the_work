package testNGpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBasics {

	/*
	 *Setup system property for browsers
      launch the edge browser
      Enter the URL
      login to app
      Validate the functionality
      logout method
      Close the browser
      delete browser cookies
	 */
	
	@BeforeMethod
	@BeforeSuite //1st Priority
	public void setUp() {
		System.out.println("@BeforeSuite -- Setup system property for browsers");
	}

	@BeforeTest //2 Priority
	public void launchBrowser(){
		System.out.println("@BeforeTest--launch the edge browser");
	}
	
	@BeforeClass //3 Priority
	public void enterURL(){
		System.out.println("@BeforeClass--Enter the URL");
	}

	@BeforeMethod //4 Priority
	public void login() {
		System.out.println("@BeforeMethod--login to app");
	}

	/*
	 * @BeforeMethod
	 * @Test --1
	 * @AfterMethod
	 * 
	 * 
	 * @BeforeMethod
	 * @Test --2
	 * @AfterMethod
	 */
	@Test //5 Priority
	public void testValidation() {

		System.out.println("@Test 1  -- Validate the functionality");
	}
	
	@Test
	public void searchValidation() {

		System.out.println("@Test 2 --Validate the search functionality");
	}

	@AfterMethod //6 Priority
	public void logout() {
		System.out.println("@AfterMethod -- logout method");
	}

	@AfterTest //7 Priority
	public void deleteAllCookies() {
		System.out.println("@AfterTest -- delete browser cookies");
	}

	@AfterClass //8 Priority
	public void closeBrowser() {
		System.out.println("@AfterClass -- Close the browser");
	}

	@AfterSuite //9 Priority
	public void generateReport() {
		System.out.println("@AfterSuite -- generate the report");
	}
}
