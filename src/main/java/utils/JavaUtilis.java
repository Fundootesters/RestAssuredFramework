package utils;

import java.util.Base64;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import pojo.Credentials;

public class JavaUtilis {
	
	//Username: admin
	//password : admin123
	//admin:admin123
	
	
	public static Credentials base64Encode(final String username, final String password) {
		String cred= username + ":" + password;
	
		
		try {
			cred= Base64.getEncoder().encodeToString(cred.getBytes());
			System.out.println(cred);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Credentials loginCred = new Credentials();
		loginCred.setCredentials(cred);
		
		return loginCred;
	}
	
	public static String randomNumebr() {
		Random random = new Random();
		int randomNumber = random.nextInt(1000);
		String id = Integer.toString(randomNumber);
		
		return id;
		
	}
	
	
	public static String randomStrig() {
		String randomSTring = RandomStringUtils.randomAlphabetic(8);
		return randomSTring;
	}
	
	public static void main(String[] args) {
		JavaUtilis utils = new JavaUtilis();
		utils.base64Encode("admin", "admin123");
	}

	

}
