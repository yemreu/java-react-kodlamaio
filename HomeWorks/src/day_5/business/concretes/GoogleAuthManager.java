package day_5.business.concretes;

import java.util.Map;

import day_5.business.abstracts.AuthService;
import day_5.core.adapters.abstracts.AuthServiceAdapter;
import day_5.dataAccess.abstracts.UserDao;
import day_5.entities.concretes.User;

public class GoogleAuthManager implements AuthService{
	
	UserDao userDao;
	AuthServiceAdapter authServiceAdapter;
	
	public GoogleAuthManager(UserDao userDao,AuthServiceAdapter authServiceAdapter) {
		this.userDao = userDao;
		this.authServiceAdapter = authServiceAdapter;
	}

	@Override
	public void auth() {
		Map<String,String> data = authServiceAdapter.auth();
		if(userDao.getAuthUser(data.get("unique_id")) == -1) {
			User user = new User(userDao.lastId()+1,data.get("firstName"),data.get("lastName"),data.get("email"),"",true);
			data.put("provider","google");
			userDao.addUser(user);
			userDao.addAuthUser(userDao.lastId(), data);
			System.out.println("Merhaba " + user.getFirstName() + " Google Auth ile kayıt olundu.");
		}else {
			int user_id = userDao.getAuthUser(data.get("unique_id"));
				User user = userDao.getUserWithId(user_id);
				if(user != null) {
					System.out.println("Merhaba " + user.getFirstName() + " Google Auth ile giriş yapıldı.");
				}else {
					System.out.println("Bir hata oluştu.");
				}
		}
	}
}
