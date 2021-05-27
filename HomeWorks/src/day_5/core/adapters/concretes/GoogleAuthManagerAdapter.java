package day_5.core.adapters.concretes;

import java.util.Map;

import day_5.GoogleAuth.GoogleAuthApi;
import day_5.core.adapters.abstracts.AuthServiceAdapter;

public class GoogleAuthManagerAdapter implements AuthServiceAdapter{

	@Override
	public Map<String,String> auth() {
		GoogleAuthApi googleAuthApi = new GoogleAuthApi();
		return googleAuthApi.auth();
	}

}
