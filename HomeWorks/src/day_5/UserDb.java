package day_5;

import java.util.ArrayList;
import java.util.List;

import day_5.entities.concretes.User;

public class UserDb {

	List<User> users = new ArrayList<>();
	
	public void add(User user) {
		users.add(user);
	}
	
	public User get(String email) {
		for (User user : users) {
			if(user.getEmail().equals(email)) return user;
		}
		return null;
	}
}
