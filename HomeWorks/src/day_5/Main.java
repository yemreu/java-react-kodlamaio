package day_5;

import day_5.business.abstracts.AuthService;
import day_5.business.abstracts.UserService;
import day_5.business.concretes.GoogleAuthManager;
import day_5.business.concretes.UserManager;
import day_5.core.adapters.concretes.GoogleAuthManagerAdapter;
import day_5.dataAccess.concretes.HibernateUserDao;
import day_5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserDb userDb = new UserDb();
		UserService userService = new UserManager(new HibernateUserDao(userDb));
		
		//Lütfen tüm alanları doldurunuz.
		User emre = new User(1,"","uzun","yunusemreuzun@outlook.com","123456",false);
		userService.register(emre);
		
		emre = new User(1,"emre","uzun","yunusemreuzun@outlook.com","123456",false);
		userService.register(emre);
		//validation
		userService.verificationForUser(emre.getEmail(), "verificationCodee");
		userService.verificationForUser(emre.getEmail(), "verificationCode");
		
		System.out.println();
		
		//Parola en az 6 karakterden oluşmalıdır.
		User yunus = new User(2,"emre","uzun","1yunusemreuzun@outlook.com","12345",false);
		userService.register(yunus);
		
		yunus = new User(2,"emre","uzun","1yunusemreuzun@outlook.com","123456",false);
		userService.register(yunus);
		
		System.out.println();
		
		//E-posta geçerli formatta değil.
		User uzun = new User(3,"emre","uzun","2yunusemreuzunoutlook.com","123456",false);
		userService.register(uzun);
		
		uzun = new User(3,"emre","uzun","2yunusemreuzun@outlook.com","123456",false);
		userService.register(uzun);
		
		System.out.println();
		
		//Bu e-posta daha önce kullanılmış.
		User a = new User(4,"a","a","yunusemreuzun@outlook.com","123456",false);
		userService.register(a);
				
		a = new User(4,"aa","aa","a@outlook.com","123456",false);
		userService.register(a);
		
		System.out.println();
		
		//Ad ve soyad en az 2 karakterden oluşmalıdır.
		User b = new User(5,"b","b","b@outlook.com","123456",false);
		userService.register(b);
		
		b = new User(5,"bb","bb","b@outlook.com","123456",false);
		userService.register(b);
		
		System.out.println();
		
		userService.login("emreuzun@outlook.com", "123456");
		userService.login("emreuzun@outlook.com", "654321");
		userService.login("yunusemreuzun@outlook.com", "123456");
		
		System.out.println();
		
		//Google Auth
		AuthService authService = new GoogleAuthManager(new HibernateUserDao(userDb), new GoogleAuthManagerAdapter());
		authService.auth();
		authService.auth();
		
		userDb.printall();
	}

}
