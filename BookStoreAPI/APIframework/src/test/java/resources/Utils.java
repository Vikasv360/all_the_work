package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.stream.Stream;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
	
	public static RequestSpecification req; //made as static as it is to be used for all the test
	public RequestSpecification requestSpecifications() throws IOException {

	
		RestAssured.config = RestAssuredConfig.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());

		if(req==null) 
		{
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		req = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl"))
				.addQueryParam("key", "qaclick123").addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log)).setContentType(ContentType.JSON).build();
		return req;
		}
		return req;

	}

	public static String getGlobalValue(String key) throws IOException {

		Properties prop = new Properties();
		FileInputStream fil = new FileInputStream(
				"C:\\Users\\vikasv\\Desktop\\BookStoreAPI\\APIframework\\src\\test\\java\\resources\\global.properties");
		prop.load(fil);
		return prop.getProperty(key);

	}
	
	public String getJsonPath(Response response,String key){
		
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		return js.get(key).toString();
		}
}
