package day_2;

public class Main {

	public static void main(String[] args) {
		Instructor enginHoca = new Instructor(1, "Engin Demiroğ", "Engin Demiroğ is a Udemy instructor with educational courses available for enrollment.");
		
		Course javaReact = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA & REACT)", "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.", enginHoca);
		
		CourseManager courseManager = new CourseManager();
		courseManager.enrollInCourse(javaReact);
	}

}
