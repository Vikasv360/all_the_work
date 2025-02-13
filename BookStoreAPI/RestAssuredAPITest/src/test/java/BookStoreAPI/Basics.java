package BookStoreAPI;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import Files.Payload;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Rest Assured works with Given,When & Then
		//Given - All input details
		//When - Submit the API - resource, http methods
		//Then - Validate the response
		RestAssured.config = RestAssuredConfig.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());
		
		//Add place API
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response = given().log().all().header("Content-Type","text/plain")
		.queryParam("key", "qaclick123").body(Payload.addPlace())
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200)
		.body("scope", equalTo("APP"))
		.header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		JsonPath js = new JsonPath(response);
		String place_ID = js.getString("place_id");
		System.out.println(place_ID);
		
		//Update Place API
		String newAddress = "70 winter walk, USA";
		
		given().log().all().header("Content-Type","text/plain")
		.queryParam("key", "qaclick123").body("{\r\n"
				+ "\"place_id\":\""+place_ID+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}")
		.when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200)
		.body("msg", equalTo("Address successfully updated"));
		
		//Get Place API
		
		String getPlaceResponse = given().log().all()
		.queryParam("key", "qaclick123").queryParam("place_id", place_ID)
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200)
		.extract().response().asString();
		
		JsonPath js1 = new JsonPath(getPlaceResponse);
		String actAddress = js1.getString("address");
		System.out.println(actAddress);
		Assert.assertEquals(newAddress, actAddress);
		
	}
}
