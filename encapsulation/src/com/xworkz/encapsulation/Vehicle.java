package com.xworkz.encapsulation;

public class Vehicle {

	String shopName = "Star Maker";
	String owner = "Kushal";
	int noOf4Wheels = 27;
	int noOf2Wheels = 38;
	int noOfElectrics = 10;
	private boolean chargingStation = true;
	public String carBrand;
	public String bikeBrand;
	private double investment = 6392974;
	public boolean selfDrivingcar;
	public String location;

	public void setChargingStation(boolean chargingStation) {
		this.chargingStation = chargingStation;
	}

	public boolean getChargingStation() {
		return chargingStation;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

	public double getInvestment() {
		return investment;
	}

}
