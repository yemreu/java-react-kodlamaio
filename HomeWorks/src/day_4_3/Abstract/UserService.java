package day_4_3.Abstract;

import day_4_3.Entities.User;

public interface UserService {

	void save(User user);
	void update(User user);
	void delete(User user);
}
