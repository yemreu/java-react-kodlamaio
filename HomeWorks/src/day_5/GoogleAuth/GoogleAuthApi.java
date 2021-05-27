package day_5.GoogleAuth;

import java.util.HashMap;
import java.util.Map;

public class GoogleAuthApi {

	public Map<String,String> auth(){
		Map<String,String> googleUserData = new HashMap<>();
		googleUserData.put("unique_id","54896");
		googleUserData.put("firstName", "google emre");
		googleUserData.put("lastName", "google uzun");
		googleUserData.put("email", "test@gmail.com");
		return googleUserData;
	}
}
