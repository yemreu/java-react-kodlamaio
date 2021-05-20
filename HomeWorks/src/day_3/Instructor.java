package day_3;

public class Instructor extends User{
	
	private String details;
	
	public Instructor(int id, String name, String details) {
		super(id,name);
		this.details = details;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
}
