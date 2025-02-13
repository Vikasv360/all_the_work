package ecomTestSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import requestBody.GetAllProducts;
import requestBody.LoginPayload;
import responseBody.GetAllProductResponseBody;
import responseBody.LoginResponseBody;

import static io.restassured.RestAssured.*;



import io.restassured.RestAssured;

public class EcomAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.config = RestAssuredConfig.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());
		RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
		.setContentType(ContentType.JSON).build();
		
		LoginPayload lg = new LoginPayload();
		lg.setUserEmail("vikas7892@gmail.com");
		lg.setUserPassword("Test@123");
		
		 RequestSpecification reqLogin = given().log().all().spec(spec).body(lg);
		 
		LoginResponseBody loginResponse = reqLogin.when().post("/api/ecom/auth/login")
		.then().log().all().extract().response().as(LoginResponseBody.class);
		
		String token = loginResponse.getToken();
		String userID =  loginResponse.getUserId();
		 
		
		//getProduct
		GetAllProducts gap = new GetAllProducts();
		gap.setMaxPrice((Integer) 0);
		gap.setMinPrice((Integer) 0);
		gap.setProductName("");
		gap.setProductCategory(null);
		gap.setProductSubCategory(null);
		
		RequestSpecification getProspec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token)
				.build();
		
		 RequestSpecification getPro = given().log().all().spec(getProspec).body(gap);
		 
		 GetAllProductResponseBody getAllProductResponse = getPro.when().post("/api/ecom/product/get-all-products")
					.then().log().all().extract().response().as(GetAllProductResponseBody.class);
		 
		 System.out.println(getAllProductResponse.getData());
	}

}
