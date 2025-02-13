package stepDefinitions;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Admin_UserManagement {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser js = new JSONParser();
		FileReader reader = new FileReader(
				"C:\\Users\\vikasv\\Desktop\\BDD framework\\OrangeHRM\\src\\test\\java\\testDataFiles\\TestData.json");
		JSONObject testDataJson = (JSONObject) js.parse(reader);
		String userName = (String) testDataJson.get("userName");
		String password = (String) testDataJson.get("password");

		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//User management
		
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
	}

}
