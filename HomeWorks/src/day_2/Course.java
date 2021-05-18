package day_2;

public class Course {
	int id;
	String name;
	String description;
	Instructor instructor;
	
	public Course(int id, String name, String description, Instructor instructor) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.instructor = instructor;
	}
}
