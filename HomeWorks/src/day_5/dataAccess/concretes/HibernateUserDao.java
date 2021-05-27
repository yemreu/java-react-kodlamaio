package day_5.dataAccess.concretes;

import java.util.Map;

import day_5.UserDb;
import day_5.dataAccess.abstracts.UserDao;
import day_5.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	private UserDb userDb;
	
	public HibernateUserDao(UserDb userDb) {
		this.userDb = userDb;
	}

	@Override
	public boolean addUser(User user,String validationCode) {
		userDb.createUser(user,validationCode);
		return true;
	}
	
	@Override
	public boolean addUser(User user) {
		userDb.createUser(user);
		return true;
	}

	@Override
	public User getUser(String email) {
		return userDb.getUser(email);
	}
	
	@Override
	public User getUserWithId(int id) {
		return userDb.getUserWithId(id);
	}

	@Override
	public String getUserVerificationCode(String email) {
		return userDb.getUserValidationCode(email);
	}

	@Override
	public boolean verificationForUser(String email) {
		userDb.getUser(email).setVerification(true);
		return true;
	}

	@Override
	public void addAuthUser(int id,Map<String,String> data) {
		userDb.createAuthUser(id, data);
	}
	
	@Override
	public int getAuthUser(String unique_id) {
		return userDb.getAuthUser(unique_id);
	}

	@Override
	public int lastId() {
		return userDb.lastId();
	}

	

}
