package day_3;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println(course.getName() + " kursu eklendi. Eğitmen: " + course.getInstructor().getName());
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.getName() + " kursu silindi. Eğitmen: " + course.getInstructor().getName());
	}
	
	public void enrollInCourse(Course course, User user) {
		System.out.println(user.getName() + ", bir kursa katıldınız: " + course.getName() + ", Eğitmen: " + course.getInstructor().getName());
	}
	
	public void unEnrollFromACourse(Course course, User user) {
		System.out.println(user.getName() + ", bir kurstan ayrıldınız: " + course.getName() + ", Eğitmen: " + course.getInstructor().getName());
	}
}
