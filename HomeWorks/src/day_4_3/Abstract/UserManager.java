package day_4_3.Abstract;

import day_4_3.Entities.User;

public abstract class UserManager implements UserService{

	@Override
	public void save(User user) {
		System.out.println("Kullanıcı eklendi: " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi: " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı silindi: " + user.getFirstName());
	}

}
