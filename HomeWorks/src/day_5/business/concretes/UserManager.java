package day_5.business.concretes;

import org.apache.axis.utils.StringUtils;

import day_5.business.abstracts.UserService;
import day_5.core.EmailValidator;
import day_5.dataAccess.abstracts.UserDao;
import day_5.entities.concretes.User;

public class UserManager implements UserService{
	
	UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		if(StringUtils.isEmpty(user.getFirstName()) || StringUtils.isEmpty(user.getLastName()) || StringUtils.isEmpty(user.getEmail()) || StringUtils.isEmpty(user.getPassword())) {
			System.out.println("Lütfen tüm alanları doldurunuz.");
			return;
		}
		
		if(user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden oluşmalıdır.");
			return;
		}
		
		if(!EmailValidator.valid(user.getEmail())) {
			System.out.println("E-posta geçerli formatta değil.");
			return;
		}
		
		if(getUser(user.getEmail()) != null){
			System.out.println("Bu e-posta daha önce kullanılmış.");
			return;
		}
		
		if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ad ve soyad en az 2 karakterden oluşmalıdır.");
			return;
		}
		userDao.add(user);
		System.out.println("Başarıyla kayıt olundu.");
	}

	@Override
	public User getUser(String email) {
		return userDao.getUser(email);
	}

}
