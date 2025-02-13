package BookStoreAPI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class BookAPIReadJSONFromPath {

	public static void main(String[] args) throws IOException {
	//Add place API
			RestAssured.baseURI="https://rahulshettyacademy.com";
			String response = given().log().all().header("Content-Type","text/plain")
			.queryParam("key", "qaclick123").body(Files.readAllBytes(Paths.get("C:\\Users\\vikasv\\Desktop\\New folder\\addBook.json")))
			.when().post("/maps/api/place/add/json")
			.then().assertThat().statusCode(200)
			.body("scope", equalTo("APP"))
			.header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
			
			System.out.println(response);
			JsonPath js = new JsonPath(response);
			String place_ID = js.getString("place_id");
			System.out.println(place_ID);
	}
}
