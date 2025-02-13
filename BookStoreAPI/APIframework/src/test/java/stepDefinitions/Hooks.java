package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		//execute this code on;y when place id is null
		//Write a code that will give place id
		
		StepDefinitions m = new StepDefinitions();
		m.user_adds_place_payload_with("Vikas", "Kannada", "India");
		m.user_calls_with_http_request("AddPlaceAPI","POST");
		m.user_verifies_place_id_created_maps_to_using("Vikas", "POST");
	}
}
