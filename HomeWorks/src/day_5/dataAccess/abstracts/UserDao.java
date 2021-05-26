package day_5.dataAccess.abstracts;

import day_5.entities.concretes.User;

public interface UserDao {

	void add(User user);
	User getUser(String email);
}
