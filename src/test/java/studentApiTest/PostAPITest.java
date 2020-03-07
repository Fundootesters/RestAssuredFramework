package studentApiTest;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiBuilders.PostAPIBuilder;
import apiConfigs.APIPath;
import apiConfigs.HeaderConfigs;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.response.Response;
import utils.JavaUtilis;

public class PostAPITest extends BaseTest {

	String id;
	
	@Test(priority =1)
	public void validPostAPITest() {

		test.log(LogStatus.INFO, "My test is starting.....");

		HeaderConfigs header = new HeaderConfigs();
		PostAPIBuilder builder = new PostAPIBuilder();

		id= JavaUtilis.randomNumebr();
		
		Response response = RestAssured.given().when().headers(header.defaultHeaders()).body(
				builder.postRequestBody(JavaUtilis.randomNumebr(), JavaUtilis.randomStrig(), JavaUtilis.randomStrig()))
				.when().post(APIPath.apiPath.CREATE_POST);

		APIVerification.responseKeyValidationFromJsonObject(response, "title");
		APIVerification.responseCodeValiddation(response, 201);
		APIVerification.responseTimeValidation(response);

		test.log(LogStatus.INFO, "My test has been ended.....");

	}
	
	@Test(priority =2)
	public void invalidPostAPITest() {
		
	}

}
