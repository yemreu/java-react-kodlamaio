package day_3;

public class InstructorManager extends UserManager{
	
	@Override
	public void registerUser(User user) {
		System.out.println("Eğitmen " + user.getName() + " kaydedildi.");
	}
	
	@Override
	public void deleteUser(User user) {
		System.out.println("Eğitmen " + user.getName() + " silindi.");
	}
}
