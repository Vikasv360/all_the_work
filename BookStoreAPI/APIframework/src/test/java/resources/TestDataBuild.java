package resources;

import java.util.ArrayList;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import pojoClasses.AddPlaceReqBody;
import pojoClasses.LocationDetailsPojo;

public class TestDataBuild {

	
	public AddPlaceReqBody addPlace(String name, String language, String address) {
		
		RestAssured.config = RestAssuredConfig.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());

		AddPlaceReqBody add = new AddPlaceReqBody();
		add.setAccuracy(50);
		add.setName(name);
		add.setAddress(address);
		add.setLanguage(language);
		add.setWebsite("http://google.com");
		add.setPhone_number("(+91) 983 893 3937");

		LocationDetailsPojo loc = new LocationDetailsPojo();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		add.setLocation(loc);

		ArrayList<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		add.setTypes(myList);
		return add;
	}
	
	public String deletePlacePayload(String place_id) {
		
		return "{\r\n"
				+ "\r\n"
				+ "    \"place_id\":\""+place_id+"\"\r\n"
				+ "}\r\n"
				+ "";
	}
}
