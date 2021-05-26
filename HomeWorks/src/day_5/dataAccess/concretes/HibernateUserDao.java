package day_5.dataAccess.concretes;

import day_5.UserDb;
import day_5.dataAccess.abstracts.UserDao;
import day_5.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	private UserDb userDb;
	
	public HibernateUserDao(UserDb userDb) {
		this.userDb = userDb;
	}

	@Override
	public void add(User user) {
		userDb.add(user);
	}

	@Override
	public User getUser(String email) {
		return userDb.get(email);
	}

}
