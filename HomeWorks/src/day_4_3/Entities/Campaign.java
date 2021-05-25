package day_4_3.Entities;

import java.time.LocalDate;

import day_4_3.Abstract.Entity;

public class Campaign implements Entity{

	private int id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private int discountRate;
	
	public Campaign(int id, String name, LocalDate startDate, LocalDate endDate, int discountRate) {
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
}
