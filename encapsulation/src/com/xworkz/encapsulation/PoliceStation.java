package com.xworkz.encapsulation;

public class PoliceStation {
	
	String area ="Rajajinagara";
	String location = "Bangalore";
	int noOfStaff = 15;
	private int noOfCells = 10;
	String headName = "Surya ";
	long contactNo = 87263824l ;
	public String colorOfBuild;
	public boolean flagpole;
	public boolean steps;
	public int noOfLadyCops;
	private int noOfGuns = 7;
	
	public void setNoOfCells(int noOfCells) {
		this.noOfCells = noOfCells;
	}

	public int getNoOfCells() {
		return noOfCells;
	}

	public void setNoOfGuns(int noOfGuns) {
		this.noOfGuns = noOfGuns;
	}

	public int getNoOfGuns() {
		return noOfGuns;
	}

}
