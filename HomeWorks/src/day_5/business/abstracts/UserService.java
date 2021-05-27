package day_5.business.abstracts;

import day_5.entities.concretes.User;

public interface UserService {

	void register(User user);
	void login(String email,String password);
	void verificationForUser(String email,String verificationCode);
	User getUser(String email);
}
