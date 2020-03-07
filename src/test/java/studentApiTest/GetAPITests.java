package studentApiTest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.relevantcodes.extentreports.LogStatus;

import apiConfigs.APIPath;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPITests extends BaseTest{
	
	@Test
	public void getAPITest() {
		
		//RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_POSTS).then().log().all().statusCode(400);
		test.log(LogStatus.INFO, "My test is starting......");
		
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_POSTS);
		
		APIVerification.responseCodeValiddation(response, 400);
		APIVerification.responseTimeValidation(response);
	
		
		test.log(LogStatus.INFO, "My test is ended......");
		

	}
	
	
	//@Test
	public void getAPITest1() {
		
		//RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_POSTS).then().log().all().statusCode(400);
		
		
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_POSTS);
		
//		System.out.println(response.getBody().asString());
//		
//		System.out.println(response.getStatusCode());
//		
//		System.out.println(response.getCookies());
//		
//		System.out.println(response.getTime());
		
	
		
		JSONArray array = new JSONArray(response.getBody().asString());
		
		for(int i=0; i<array.length();i++) {
			//System.out.println(array.get(i));
			
			JSONObject obj = array.getJSONObject(i);
			System.out.println(obj.get("title"));
		}
		
	}
	
	

}
