package ecommTestSwagLabs;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class EcommTestValidations {

	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void setUp(String url,String browser) {
		if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void test(String userName,String password) {
		
	
		driver.findElement(By.cssSelector("[id='user-name']")).sendKeys(userName);
		driver.findElement(By.cssSelector("[id='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("[id='login-button']")).click();
		
	}
	
	@DataProvider
	public ArrayList<Object> getData() {
		ArrayList<Object> myData = new ArrayList<Object>();
		Object ob[] = {"standard_user","secret_sauce"};
		myData.add(ob);
	 return myData;
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
