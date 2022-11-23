package com.xworkz.methods;

public class God {
	
	private String country;
	private String gender;
	private int noOfPlace;
	private String name;
	private double height;
	private boolean powerfull;
	private String color;
	private double weight;
	private int noOfStates;
	private String fatherName;
	
	public God() {
		System.out.println("Default const of god..");
	}

	public God(String country, String gender, String name, boolean powerfull, String fatherName) {
		super();
		this.country = country;
		this.gender = gender;
		this.name = name;
		this.powerfull = powerfull;
		this.fatherName = fatherName;
	}

	@Override
	public String toString() {
		return "God [country=" + country + ", gender=" + gender + ", name=" + name + ", powerfull=" + powerfull
				+ ", fatherName=" + fatherName + "]";
	}
	
	@Override
	public boolean equals(Object other) {
		System.out.println("Equal method overridden..");
		if(other instanceof God) {
			System.out.println("other is instance of God, check the properties..");
			God cast = (God) other;
			if(this.gender.equals(cast.gender) && this.country.equals(cast.country) && this.name.equals(cast.name))  { 
					if( this.powerfull == cast.powerfull && this.fatherName.equals(cast.fatherName)) {
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getNoOfPlace() {
		return noOfPlace;
	}

	public void setNoOfPlace(int noOfPlace) {
		this.noOfPlace = noOfPlace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isPowerfull() {
		return powerfull;
	}

	public void setPowerfull(boolean powerfull) {
		this.powerfull = powerfull;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getNoOfStates() {
		return noOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

}
