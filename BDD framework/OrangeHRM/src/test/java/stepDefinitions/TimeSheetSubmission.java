package stepDefinitions;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeSheetSubmission {

	public static void main(String[] args) throws IOException, ParseException, InterruptedException {
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

//Timesheet submission
		driver.findElement(By.cssSelector("button[title='My Timesheet']")).click();
		driver.findElement(By.cssSelector("button[class='oxd-icon-button orangehrm-timeperiod-icon --prev']")).click();
		driver.findElement(By.cssSelector("button[class='oxd-icon-button orangehrm-timeperiod-icon --prev']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {

			WebElement createTimesheetButton = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Create Timesheet']")));
			createTimesheetButton.click();
		} catch (Exception e) {
			// If the button is not visible, click the "Edit" button instead
			driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
		}

		driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys("Inter");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		List<WebElement> projList = driver.findElements(By.cssSelector("div[role='listbox']"));

		for (int i = 0; i < projList.size(); i++) {

			String rqrProj = projList.get(i).getText();
			System.out.println(rqrProj);

			if (rqrProj.equals("Internal - General HR Tasks")) {

				act.sendKeys(Keys.ENTER).build().perform();
				break;
			}

			else {
				// Optionally, navigate down the list (using arrow down)
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				act.sendKeys(Keys.ENTER).build().perform();
			}
		}

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='oxd-select-text oxd-select-text--active']")).click();
		List<WebElement> activityList = driver.findElements(By.cssSelector("div[role='listbox']"));

		for (int i = 0; i < activityList.size(); i++) {

			String rqrAct = activityList.get(i).getText();
			System.out.println(rqrAct);

			if (rqrAct.equals("Payroll Administration")) {

				act.sendKeys(Keys.ENTER).build().perform();
				break;
			}

			else {
				// Optionally, navigate down the list (using arrow down)
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				act.sendKeys(Keys.ENTER).build().perform();
			}
		}

		List<WebElement> timeInputs = driver.findElements(By.cssSelector("input[class='oxd-input oxd-input--active']"));

		System.out.println(timeInputs.size());
		for (int i = 0; i < timeInputs.size() - 2; i++) {
			timeInputs.get(i).sendKeys("8");
		}

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		WebElement submitTimesheet = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Submit']")));
		submitTimesheet.click();

	}

}
