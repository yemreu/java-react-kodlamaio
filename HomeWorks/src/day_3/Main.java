package day_3;

public class Main {

	public static void main(String[] args) {
		//Instructors
		Instructor enginHoca = new Instructor(1,"Engin Demiroğ","Engin Demiroğ is a Udemy instructor with educational courses available for enrollment.");
		Instructor anInstructor = new Instructor(2,"An Instructor","An Instructor details.");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.registerUser(enginHoca);
		instructorManager.registerUser(anInstructor);
		
		System.out.println();
		
		instructorManager.deleteUser(anInstructor);
		
		System.out.println();
		
		//Students
		Student emre = new Student(1,"Y. Emre Uzun");
		Student aStudent = new Student(2,"A Student");
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerUser(emre);
		studentManager.registerUser(aStudent);
		
		System.out.println();
		
		studentManager.deleteUser(aStudent);
		
		System.out.println();
		
		//Courses
		Course programlamayaGiris = new Course(1,"Programlamaya Giriş İçin Temel Kurs","PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.",enginHoca);
		Course csharpAngular = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (C# & ANGULAR)","2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",enginHoca);
		Course javaReact = new Course(3, "Yazılım Geliştirici Yetiştirme Kampı (JAVA & REACT)", "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.", enginHoca);
		
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(programlamayaGiris);
		courseManager.addCourse(csharpAngular);
		courseManager.addCourse(javaReact);
		
		System.out.println();
		
		courseManager.deleteCourse(csharpAngular);
		
		System.out.println();
		
		courseManager.enrollInACourse(javaReact, emre);
		
		System.out.println();
		
		courseManager.unEnrollFromACourse(javaReact, emre);
		
	}

}
