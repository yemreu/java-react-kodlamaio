package day_2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Instructor enginHoca = new Instructor(1, "Engin Demiroğ", "Engin Demiroğ is a Udemy instructor with educational courses available for enrollment.");
		
		Course javaReact = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA & REACT)", "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.", enginHoca);
		
		System.out.println("------Instructors------");
		Instructor[] instructors = {enginHoca};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.id + ". " + instructor.name);
		}
		
		System.out.println("\n------Courses------");
		Course[] courses = {javaReact};
		
		for (Course course : courses) {
			System.out.println(course.id + ". " + course.name);
		}
		
		System.out.println();
		
		CourseManager courseManager = new CourseManager();
		courseManager.enrollInCourse(javaReact);
	}

}
