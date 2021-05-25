package day_4_3.Entities;

import java.time.LocalDate;

import day_4_3.Abstract.Entity;

public class User implements Entity{
	
	private int id;
	private String nationalNumber;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	public User(int id, String nationalNumber, String firstName, String lastName, LocalDate dateOfBirth) {
		this.id = id;
		this.nationalNumber = nationalNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalNumber() {
		return nationalNumber;
	}

	public void setNationalNumber(String nationalNumber) {
		this.nationalNumber = nationalNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
