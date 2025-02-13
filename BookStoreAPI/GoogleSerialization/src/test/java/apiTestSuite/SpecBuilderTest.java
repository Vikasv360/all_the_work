package apiTestSuite;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojoClasses.AddPlacePojo;
import pojoClasses.LocationDetailsPojo;

public class SpecBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddPlacePojo add = new AddPlacePojo();
		add.setAccuracy(50);
		add.setName("Frontline house");
		add.setAddress("29, side layout, cohen 09");
		add.setLanguage("French-IN");
		add.setWebsite("http://google.com");
		add.setPhone_number("(+91) 983 893 3937");

		LocationDetailsPojo loc = new LocationDetailsPojo();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		add.setLocation(loc);
		
		ArrayList<String> myList =  new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		add.setTypes(myList);
		
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123")
		.setContentType(ContentType.JSON).build();
		
		RequestSpecification res = given().spec(req)
		.body(add);
		
		 res.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(res);
		
	}

}
