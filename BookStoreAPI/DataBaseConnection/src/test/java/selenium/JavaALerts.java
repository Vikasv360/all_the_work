package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaALerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		
		Alert pop = driver.switchTo().alert();
		System.out.println(pop.getText());
		pop.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		System.out.println(pop.getText());
		pop.dismiss();
		
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		System.out.println(pop.getText());
		Thread.sleep(5000);
		pop.sendKeys("vikas");
		
	}

}
