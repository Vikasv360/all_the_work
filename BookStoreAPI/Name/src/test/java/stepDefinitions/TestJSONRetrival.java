package stepDefinitions;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class TestJSONRetrival {

	@Test
	public void getData() throws IOException, ParseException {
		
		
		JSONParser json = new JSONParser();
		FileReader reader = new FileReader(".\\src\\test\\java\\jsonFiles\\test.json");
		 JSONObject testJsonObj = (JSONObject)json.parse(reader);
		 String custName = (String)testJsonObj.get("customer");
		 String cust_no = (String)testJsonObj.get("customerId");
		 System.out.println(custName + " : " + cust_no);
	}
}
