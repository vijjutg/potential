package com.xworkz.methods;

public class Hospital {
	
	private String name;
	private String place;
	private String doctorName;
	private int noOfStaff;
	private double investment;
	private int avgPatients;
	private int noOfWards;
	private int noOfFloors;
	private boolean cure;
	private boolean facility;
	
	public Hospital() {
		System.out.println("Default const of hospital..");
	}

	public Hospital(String name, String place, int noOfStaff, int avgPatients, int noOfFloors, boolean cure,
			boolean facility) {
		super();
		this.name = name;
		this.place = place;
		this.noOfStaff = noOfStaff;
		this.avgPatients = avgPatients;
		this.noOfFloors = noOfFloors;
		this.cure = cure;
		this.facility = facility;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", place=" + place + ", noOfStaff=" + noOfStaff + ", avgPatients="
				+ avgPatients + ", noOfFloors=" + noOfFloors + ", cure=" + cure + ", facility=" + facility + "]";
	}
	
	@Override
	public boolean equals(Object other) {
		System.out.println("Equal method overridden..");
		if(other instanceof Hospital) {
			
			System.out.println("other is instance of Hospital, check the properties..");
			Hospital cast = (Hospital) other;
			if(this.name.equals(cast.name) && this.place.equals(cast.place) && this.noOfStaff==cast.noOfStaff )  { 
				
					if( this.avgPatients == cast.avgPatients && this.noOfFloors==cast.noOfFloors && this.cure==cast.cure && this.facility == cast.facility) {
				    System.out.println("Both objects are equal..");
				   return true;
			      }
			}
		}
		else {
			System.err.println("other is not instance of Hospital");
		}
		return false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getNoOfStaff() {
		return noOfStaff;
	}

	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}

	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

	public int getAvgPatients() {
		return avgPatients;
	}

	public void setAvgPatients(int avgPatients) {
		this.avgPatients = avgPatients;
	}

	public int getNoOfWards() {
		return noOfWards;
	}

	public void setNoOfWards(int noOfWards) {
		this.noOfWards = noOfWards;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public boolean isCure() {
		return cure;
	}

	public void setCure(boolean cure) {
		this.cure = cure;
	}

	public boolean isFacility() {
		return facility;
	}

	public void setFacility(boolean facility) {
		this.facility = facility;
	}

}
