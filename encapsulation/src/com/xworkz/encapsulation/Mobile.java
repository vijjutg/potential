package com.xworkz.encapsulation;

public class Mobile {

	private String brand = "Vivo";
	private double version = 1.7;
	public String color = "Black";
	public double lenthOfDisplay = 2.5;
	public String modelName = "J2-PRO";
	boolean screenTouch = true;
	public double price = 8500;
	int totalStorage = 16;
	int noOfApps = 14;
	String mostUsedApp = "Instragram";
	double appStorage = 245.78;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public double getVersion() {
		return version;
	}

}
