package utitlity;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class TestUtility {

	@Test
	public void getTestData() throws IOException, ParseException {

		JSONParser json = new JSONParser();

		FileReader reader = new FileReader(".\\src\\test\\java\\jsonFiles\\Credentials.json");
		Object obj = json.parse(reader);
        //Here we are converting java object "obj" into json object
		JSONObject credObj = (JSONObject)obj;
		JSONArray userLoginsArray = (JSONArray)credObj.get("userLogins");
		//Here we are creating an empty String array to store the data
				String arr[] = new String[userLoginsArray.size()];
				
				for(int i=0;i<userLoginsArray.size();i++) {
					JSONObject userCred = (JSONObject)userLoginsArray.get(i);
					String userName = (String)userCred.get("userName");
					String password = (String)userCred.get("passWord");
					
					arr[i]=userName + "," + password;
					
				}
				
				System.out.println(arr[0]);
		

		

	}
}
