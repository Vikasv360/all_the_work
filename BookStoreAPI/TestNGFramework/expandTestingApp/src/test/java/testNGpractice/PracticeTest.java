package testNGpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTest {

	WebDriver driver;


	@BeforeMethod
	public void setUp() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
	}

	@Test(priority = 1,groups = "removeElement")
	public void addRemoveElements() {
		driver.findElement(By.cssSelector("a[href='/add_remove_elements/']")).click();
		driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
		driver.findElement(By.className("added-manually")).click();

	}

	@Test(priority = 3,groups = "checkBox",dependsOnMethods = "addRemoveElements")
	public void getTitleTest() {
		driver.findElement(By.cssSelector("a[href='/checkboxes']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected());
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected());

	}

	@Test(priority = 2,groups = "dropdown")
	public void basicAuth() {
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("a[href='/dropdown']")).click();
		driver.findElement(By.id("dropdown")).click();
		WebElement dropDownList = driver.findElement(By.id("dropdown"));
		
		Select sel = new Select(dropDownList);
		sel.selectByIndex(1);
		System.out.println(sel.getFirstSelectedOption().getText());

	}
	
	@Test(invocationCount = 3)
	public void sum() {
		int a=12;
		int b=34;
		int sum=a+b;
		System.out.println(sum);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
