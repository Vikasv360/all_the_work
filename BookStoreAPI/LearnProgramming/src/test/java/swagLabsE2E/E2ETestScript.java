package swagLabsE2E;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class E2ETestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String[] itemNames = { "Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Fleece Jacket",
				"Sauce Labs Bolt T-Shirt" };

		List NeededItems = Arrays.asList(itemNames);
		int NeededItemsSize = NeededItems.size();

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		// Login screen
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		// Inventory screen
		List<WebElement> itemList = driver.findElements(By.cssSelector("div[class='inventory_item_name ']"));

		for (int i = 0; i < itemList.size(); i++) {

			String itemRetrived = itemList.get(i).getText();
			System.out.println(itemRetrived);

			if (NeededItems.contains(itemRetrived)) {
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			}

		}

		System.out.println("*****************************************************");
		driver.findElement(By.cssSelector("a[class='shopping_cart_link']")).click();

		// Verification of items added in your cart screen
		List<WebElement> yourCart = driver.findElements(By.className("cart_item"));
		List<WebElement> items = driver.findElements(By.className("inventory_item_name"));

		ArrayList<String> itemValues = new ArrayList<>();
		for (int i = 0; i < yourCart.size(); i++) {

			WebElement cartItem = yourCart.get(i);
			String value = items.get(i).getText();
			itemValues.add(value);

		}
		int yourCartItem = itemValues.size();

		if (NeededItemsSize == yourCartItem) {
			driver.findElement(By.id("checkout")).click();
		}

		String expChkInfoScreen = "Checkout: Your Information";
		String actChkInfoScreen = driver.findElement(By.cssSelector("span[class='title']")).getText();
		Assert.assertEquals(expChkInfoScreen, actChkInfoScreen);
		driver.findElement(By.id("first-name")).sendKeys("Vikas");
		driver.findElement(By.id("last-name")).sendKeys("V");
		driver.findElement(By.id("postal-code")).sendKeys("562789");
		driver.findElement(By.id("continue")).click();
		String expChkOverScreen = "Checkout: Overview";
		String actChkOverScreen = driver.findElement(By.cssSelector("span[class='title']")).getText();
		Assert.assertEquals(expChkOverScreen, actChkOverScreen);
		List<WebElement> chkOutItemsPrices = driver.findElements(By.className("inventory_item_price"));
		ArrayList<Double> itemsPrices = new ArrayList<>();

		for (int i = 0; i < chkOutItemsPrices.size(); i++) {

			String priceTextString = chkOutItemsPrices.get(i).getText();

			String priceWithoutDollar = priceTextString.replace("$", "").trim();

			System.out.println(priceWithoutDollar);

			double itemPrice = Double.parseDouble(priceWithoutDollar);
 
			itemsPrices.add(itemPrice);
		}

		System.out.println(itemsPrices);
		double itemSum=0.0;
		for(double price : itemsPrices) {
			itemSum=itemSum + price;
		}
		System.out.println(itemSum);
		System.out.println("*******************************");
		
		String subtotalText = driver.findElement(By.className("summary_subtotal_label")).getText();
		
		String[] subtotalTextSplit = subtotalText.split("\\$"); // Escape the dollar sign

		String subtotalValue = subtotalTextSplit[1];

		double subtotalPrice = Double.parseDouble(subtotalValue);
		System.out.println(subtotalPrice);
		Assert.assertEquals(itemSum, subtotalPrice);
		
		driver.findElement(By.id("finish")).click();
		String actChkCmplt = driver.findElement(By.xpath("//h2")).getText();
		String expChkCmplt = "Thank you for your order!";
		Assert.assertEquals(actChkCmplt, expChkCmplt);
		
		driver.findElement(By.xpath("//button[@name='back-to-products']")).click();
		String exptHomePage = "Products";
		String actHomePage = driver.findElement(By.cssSelector("span[class='title']")).getText();
		Assert.assertEquals(exptHomePage, actHomePage);
	}
	}

}
