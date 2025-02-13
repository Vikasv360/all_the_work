package googleMapApi;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GoogleMapAddPlaceAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String res = given().param("key", "qaclick123").header("Content-Type", "text/plain")
		.body("")
		.when().log().all().post("/maps/api/place/add/json")
		.then().statusCode(200).extract().response().asString();
		
		
		
		
		

	}

}
