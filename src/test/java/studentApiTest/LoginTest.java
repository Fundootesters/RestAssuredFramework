package studentApiTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo.Credentials;
import utils.JavaUtilis;

public class LoginTest {
	
	@Test
	public void loginTest() {
		Credentials logincred= JavaUtilis.base64Encode("admin", "admin123");
		System.out.println(logincred);
		
		
		RestAssured.given().when().header("LoginCred", logincred).post();
	}

}
