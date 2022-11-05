package com.xworkz.encapsulation;

public class Movie {

	private String movieName;
	String theatreName = "Navarang";
	String heroName = "Rishab Shetty";
	String herionName = "Saptami Gouda";
	private double budget;
	public int noOfSeats;
	public int noOfTypes;
	public double ticketPrice;
	public boolean snacks;
	public String location;
	double ratings = 4.5;

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getBudget() {
		return budget;
	}

}
