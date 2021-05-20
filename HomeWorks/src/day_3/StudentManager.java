package day_3;

public class StudentManager extends UserManager{

	@Override
	public void registerUser(User user) {
		System.out.println("Öğrenci " + user.getName() + " kaydedildi.");
	}
	
	@Override
	public void deleteUser(User user) {
		System.out.println("Öğrenci " + user.getName() + " silindi.");
	}
}
