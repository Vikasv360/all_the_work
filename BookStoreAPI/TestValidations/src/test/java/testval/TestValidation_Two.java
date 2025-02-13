package testval;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestValidation_Two {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
	
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(dataProvider = "testData")
	public void loginHRMS(String data) {
		
		String[] userCreds = data.split(",");
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(userCreds[0]);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(userCreds[1]);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		String actHomeScreen = driver.findElement(By.xpath("//h6")).getText();
		String exptHomeScreen = "Dashboard";
		Assert.assertEquals(actHomeScreen, exptHomeScreen);
	}
	
	@DataProvider(name="testData")
	public String[] getData() throws IOException, ParseException {
		JSONParser json = new JSONParser();

		FileReader reader = new FileReader(".\\src\\test\\java\\jsonFiles\\Credentials.json");
		Object obj = json.parse(reader);
        //Here we are converting java object "obj" into json object
		JSONObject credObj = (JSONObject)obj;
		
		//The object of the json array is stored in a variable
		JSONArray userLoginsArray = (JSONArray)credObj.get("userLogins");
		
		//Here we are creating an empty String array to store the data
		String arr[] = new String[userLoginsArray.size()];
		
		for(int i=0;i<userLoginsArray.size();i++) {
			JSONObject userCred = (JSONObject)userLoginsArray.get(i);
			String userName = (String)userCred.get("userName");
			String password = (String)userCred.get("passWord");
			
			arr[i]=userName + "," + password;
			
		}
		
		return arr;
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
