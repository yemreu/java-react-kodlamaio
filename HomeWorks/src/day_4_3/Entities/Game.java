package day_4_3.Entities;

import java.time.LocalDate;

import day_4_3.Abstract.Entity;

public class Game implements Entity{

	private int id;
	private String name;
	private String platform;
	private LocalDate releaseDate;
	private float price;
	
	public Game(int id, String name, String platform, LocalDate releaseDate, float price) {
		this.id = id;
		this.name = name;
		this.platform = platform;
		this.releaseDate = releaseDate;
		this.price = price;
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

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
