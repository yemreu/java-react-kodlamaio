package day_5.business.concretes;

import org.apache.axis.utils.StringUtils;

import day_5.business.abstracts.UserService;
import day_5.core.EmailSender;
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
		userDao.addUser(user,"verificationCode");
		System.out.println("Başarıyla kayıt olundu.");
		EmailSender.send("mail@eticaret.com", user.getEmail(), "Doğrulama", userDao.getUserVerificationCode(user.getEmail()));
	}
	
	@Override
	public void verificationForUser(String email, String verificationCode) {
		if(userDao.getUserVerificationCode(email).equals(verificationCode)) {
			userDao.verificationForUser(email);
			System.out.println("Üyelik işlemi tamamlandı.");
		}else System.out.println("Hatalı doğrulama kodu.");
	}
	
	@Override
	public void login(String email, String password) {
		User user = userDao.getUser(email);
		if(user != null && user.getEmail().equals(email) && user.getPassword().equals(password)) {
			System.out.println("Giriş başarılı.");
		}else {
			System.out.println("E-mail veya parola yanlış.");
		}
	}

	@Override
	public User getUser(String email) {
		return userDao.getUser(email);
	}
}
