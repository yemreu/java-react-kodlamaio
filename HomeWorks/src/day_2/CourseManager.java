package day_2;

public class CourseManager {
	
	public void enrollInCourse(Course course) {
		System.out.println("Kursa katıldınız: " + course.name + ", Eğitmen: " + course.instructor.name);
	}
}
