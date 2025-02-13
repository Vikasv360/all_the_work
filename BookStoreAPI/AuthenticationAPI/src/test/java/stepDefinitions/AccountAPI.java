package stepDefinitions;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import files.UserCreationReqPayload;
import files.getBookReponse;

public class AccountAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.config = RestAssuredConfig.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());
		UserCreationReqPayload uc = new UserCreationReqPayload();
		uc.setUserName("mkbindu");
		uc.setPassword("Test@123");
		
		RestAssured.baseURI="https://demoqa.com";
		String repsonse = given().log().all().header("Content-Type", "application/json").body(uc)
		.when().post("Account/v1/User").then().log().all().statusCode(406).extract().response().asString();
		System.out.println(repsonse);
		
		
		
	}

}
