package com.xworkz.encapsulation;

public class Hospital {

	private String name = "Priya";
	int noOfWards = 60;
	private int noOfStaff = 30;
	String mainDoctor = "Ashwath Kumar";
	boolean bloodTest = true;
	int noOfPatients = 20;
	double oneDayBill = 500;
	long contactNo = 8033526837l;
	public boolean foodAvailable;
	public String treatmentType;
	public int noOfFloors;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}

	public int getNoOfStaff() {
		return noOfStaff;
	}

}
