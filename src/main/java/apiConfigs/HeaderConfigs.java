package apiConfigs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {
	
	public HeaderConfigs() {
		
	}
	
	public Map<String, String> defaultHeaders(){
		Map<String, String> defalutHeaders = new HashMap<String, String>();
		defalutHeaders.put("Content-Type", "application/json");
		
		
		return defalutHeaders;
		
	}
	
	
	public Map<String, String> headersWithToken(){
		Map<String, String> defalutHeaders = new HashMap<String, String>();
		defalutHeaders.put("Content-Type", "application/json");
		defalutHeaders.put("Acess_Token", "sdjhvbshjdvbjhsdvbhjsdvbljhdsbv");
		defalutHeaders.put("jwt_token", "sdjhvbshjdvbjhsdvbhjsdvbljhdsbv");
		defalutHeaders.put("Tenet_user", "test");
		
		return defalutHeaders;
		
	}
	
//	public Map<String, String> headersWithToken(){
//		Map<String, String> defalutHeaders = new HashMap<String, String>();
//		defalutHeaders.put("Content-Type", "application/json");
//		defalutHeaders.put("Acess_Token", "sdjhvbshjdvbjhsdvbhjsdvbljhdsbv");
//		defalutHeaders.put("jwt_token", "sdjhvbshjdvbjhsdvbhjsdvbljhdsbv");
//		defalutHeaders.put("Tenet_user", "test");
//		
//		return defalutHeaders;
//		
//	}
	
	

}
