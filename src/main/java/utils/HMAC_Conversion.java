package utils;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HMAC_Conversion {
	
	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
		
		String secret = "admin";
		String message = "meassge";
		
		Mac sha256= Mac.getInstance("HmacSHA256");
		
		SecretKeySpec s_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
		sha256.init(s_key);
		
		String hash=Base64.encodeBase64String(sha256.doFinal(message.getBytes()));
		
		System.out.println("Hash value " + hash);
		
	}

}
