package com.xworkz.encapsulation;

public class House {

	String name = "Kushi Nilaya";
	private String ownerName = "Goutham";
	private double budget = 15;
	int noOfMembres = 6;
	long landline = 81739721l;
	String location = "Kudligi";
	int noOfchilds = 2;
	public boolean grandParentsAlive;
	public int noOfRooms;
	public boolean compound;
	public String color;

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getBudget() {
		return budget;
	}

}
