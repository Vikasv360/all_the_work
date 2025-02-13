package Authentications;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import pojoClasses.Api;
import pojoClasses.GetCourses;
import pojoClasses.WebAutomation;
public class oAuthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] courseTitles = {"Selenium Webdriver Java","Cypress","Protractor"};
		
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		String response=given().formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W").formParam("grant_type", "client_credentials")
		.formParam("scope", "trust")
//		.header("Content-Type","multipart/form-data; boundary=<calculated when request is sent>")
		.when().log().all().post("oauthapi/oauth2/resourceOwner/token").asString();
		
		JsonPath js = new JsonPath(response);
		String accessToken = js.getString("access_token");
//		System.out.println(accessToken);
		System.out.println(response);
		
		GetCourses gc=given().queryParam("access_token", accessToken)
		.when().log().all()
		.get("/oauthapi/getCourseDetails").as(GetCourses.class);
		
		System.out.println(gc.getLinkedIn());
		List<Api> apiCourses =gc.getCourses().getApi();
		for(int i=0;i<apiCourses.size();i++) {
			
			if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing")) {
				System.out.println(apiCourses.get(i).getPrice()); 
			}
			
		}
		ArrayList<String> arrayCourseWeb = new ArrayList<String>();
		
		 List<WebAutomation> web = gc.getCourses().getWebAutomation();
		 for(int j=0;j<web.size();j++) {
			 
			 arrayCourseWeb.add(web.get(j).getCourseTitle()); 
		 }
		 
		 List<String> expctWebArray = Arrays.asList(courseTitles);
		 Assert.assertTrue(arrayCourseWeb.equals(expctWebArray));
	}

}
