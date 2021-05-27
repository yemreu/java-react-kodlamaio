package day_5.dataAccess.abstracts;

import java.util.Map;

import day_5.entities.concretes.User;

public interface UserDao {

	boolean addUser(User user,String validationCode);
	boolean addUser(User user);
	boolean verificationForUser(String email);
	User getUser(String email);
	User getUserWithId(int id);
	String getUserVerificationCode(String email);
	void addAuthUser(int id,Map<String,String> data);
	int getAuthUser(String unique_id);
	int lastId();
}
