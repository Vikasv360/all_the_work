package myConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DataBaseConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		
		String host="localhost";
		String port="3306";
		
		Connection con = DriverManager
				.getConnection("jdbc:mysql://" + host + ":" + port + "/customers","Vikas","Vikas@7892");
		
		Statement s = con.createStatement();
		ResultSet result = s.executeQuery("select * from credentails where scenario = 'PlacingOrder'");

		while(result.next()) {
			driver.findElement(By.id("user-name")).sendKeys(result.getString("username"));
			driver.findElement(By.id("password")).sendKeys(result.getString("password"));
		}
		driver.findElement(By.id("login-button")).click();
	}

}
