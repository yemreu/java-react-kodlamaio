package day_5.business.abstracts;

import day_5.entities.concretes.User;

public interface UserService {

	void register(User user);
	User getUser(String email);
}
