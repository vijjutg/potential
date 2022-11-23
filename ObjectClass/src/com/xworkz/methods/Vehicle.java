package com.xworkz.methods;

public class Vehicle {
	
	private String name;
	private String brand;
	private double price;
	private int quantity;
	private String fuel;
	private int noOfWheels;
	private boolean license;
	private double weight;
	private double milage;
	private double capacity;
	
	public Vehicle() {
		System.out.println("Default constructor of vehicle..");
	}

	public Vehicle(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object other) {
		System.out.println("Equal method overridden..");
		if(other instanceof Vehicle) {
			System.out.println("Other is instance of vehicle check the properties");
			Vehicle cast = (Vehicle) other;
			if(this.name.equals(cast.name) && this.price== cast.price) {
				System.out.println("Both objects are equal..");
				return true;
			}
		}
		else {
			System.err.println("other is not instance of Vehicle..");
		}
		return false;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public boolean isLicense() {
		return license;
	}

	public void setLicense(boolean license) {
		this.license = license;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	
}
