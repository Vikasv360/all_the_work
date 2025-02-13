package BookStoreAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class BookAPITest {
	String id;

	@Test(dataProvider = "AddBooksData")
	public void addBook(String isbn, String asile) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().header("Content-Type", "text/plain").body(Payload.addBookPayload(isbn, asile))
				.when().post("Library/Addbook.php").then().assertThat().statusCode(200).extract().asString();

		System.out.println(response);
		JsonPath js = new JsonPath(response);
		id = js.get("ID");
		System.out.println(id);
	}
	
	@Test
	public void deleteBook() {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response1 = given().header("Content-Type", "text/plain").body(Payload.deleteBook(id))
				.when().post("Library/DeleteBook.php").then().assertThat().statusCode(200).extract().asString();

		System.out.println(response1);
		JsonPath js = new JsonPath(response1);
		String msg = js.get("msg");
		System.out.println(msg);
	}
	
	@DataProvider(name="AddBooksData")
	public Object[][] getData() {
		//array = collection of elements
		//multidimensional array = collection of arrays
		
		return new Object[][] {{"fgdds", "7854"},{"ytge", "2457"},{"posli", "7484"}};
	}

}