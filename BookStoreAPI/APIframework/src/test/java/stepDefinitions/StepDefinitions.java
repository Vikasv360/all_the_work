package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefinitions extends Utils {

	RequestSpecification resspec;
	Response response;
	TestDataBuild data = new TestDataBuild();
	static String placeID;  //static is used for the variable which is used for multiple test cases
	@Given("User adds place payload with {string}, {string},{string}")
	public void user_adds_place_payload_with(String name, String language, String address) throws IOException {
		
		resspec = given().log().all().spec(requestSpecifications()).body(data.addPlace(name, language, address));
		
	}
	
	@When("User calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
		APIResources resourceAPI = APIResources.valueOf(resource);
		System.out.println(resourceAPI.getResource());
		
		if(method.equalsIgnoreCase("POST")) {
		response = resspec.when().post(resourceAPI.getResource())
				.then().assertThat().statusCode(200).extract().response();
		}
		else if(method.equalsIgnoreCase("GET")) {
		response = resspec.when().get(resourceAPI.getResource())
				.then().assertThat().statusCode(200).extract().response();
		}
	
	}
	
	@Then("User is displayed with success status code {int}")
	public void user_is_displayed_with_success_status_code(Integer int1) {
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String expectedValue) {
		
		Assert.assertEquals(getJsonPath(response,keyValue), expectedValue);

	}

	@Then("User verifies place_id created maps to {string} using {string}")
	public void user_verifies_place_id_created_maps_to_using(String expectedName, String resource) throws IOException {
	   
		placeID = getJsonPath(response, "place_id");
		resspec = given().log().all().spec(requestSpecifications()).queryParam("place_id", placeID);
		user_calls_with_http_request(resource, "GET");
		String actualName = getJsonPath(response, "name");
		Assert.assertEquals(actualName, expectedName);
	}

	@Given("deletePlace payload")
	public void delete_place_payload() throws IOException {
	    given().spec(requestSpecifications()).body(data.deletePlacePayload(placeID));
	}

}
