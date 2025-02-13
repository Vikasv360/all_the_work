package Files;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {

	public static String rawToJson(String response) {
		JsonPath js = new JsonPath(response);
		return response;
	}
}
