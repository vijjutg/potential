package com.xworkz.methods;

public class Institution {
	
	private String name;
	private String place;
	private String head;
	private boolean management;
	private int noOfStudents;
	private double investment;
	private int noOfClass;
	private int noOfLectures;
	private double avgSalary;
	private boolean goodCampus;
	
	public Institution() {
		System.out.println("Default const of institution...");
	}

	public Institution(String name, String place, int noOfStudents, int noOfClass, int noOfLectures,
			boolean goodCampus) {
		super();
		this.name = name;
		this.place = place;
		this.noOfStudents = noOfStudents;
		this.noOfClass = noOfClass;
		this.noOfLectures = noOfLectures;
		this.goodCampus = goodCampus;
	}

	@Override
	public String toString() {
		return "Institution [name=" + name + ", place=" + place + ", noOfStudents=" + noOfStudents + ", noOfClass="
				+ noOfClass + ", noOfLectures=" + noOfLectures + ", goodCampus=" + goodCampus + "]";
	}
	
	@Override
	public boolean equals(Object other) {
		
		System.out.println("Equal method overridden..");
		if(other instanceof Institution) {
			
			System.out.println("other is instance of Institution, check the properties..");
			Institution cast = (Institution) other;
			if(this.name.equals(cast.name) && this.place.equals(cast.place) && this.noOfStudents==cast.noOfStudents)  { 
				
					if( this.goodCampus == cast.goodCampus && this.noOfLectures==cast.noOfLectures && this.noOfClass==cast.noOfClass) {
				    System.out.println("Both objects are equal..");
				   return true;
			      }
			}
		}
		else {
			System.err.println("other is not instance of God");
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

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public boolean isManagement() {
		return management;
	}

	public void setManagement(boolean management) {
		this.management = management;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

	public int getNoOfClass() {
		return noOfClass;
	}

	public void setNoOfClass(int noOfClass) {
		this.noOfClass = noOfClass;
	}

	public int getNoOfLectures() {
		return noOfLectures;
	}

	public void setNoOfLectures(int noOfLectures) {
		this.noOfLectures = noOfLectures;
	}

	public double getAvgSalary() {
		return avgSalary;
	}

	public void setAvgSalary(double avgSalary) {
		this.avgSalary = avgSalary;
	}

	public boolean isGoodCampus() {
		return goodCampus;
	}

	public void setGoodCampus(boolean goodCampus) {
		this.goodCampus = goodCampus;
	}
	
	

}
