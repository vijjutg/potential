package com.xworkz.encapsulation;

public class ShowRoom {

	Vehicle vehicle = new Vehicle();

	String shopName = vehicle.shopName;

	String owner = vehicle.owner;

	int noOf4Wheels = vehicle.noOf4Wheels;

	int noOf2Wheels = vehicle.noOf2Wheels;

	int noOfElectrics = vehicle.noOfElectrics;

	public void display() {
		System.out.println(shopName);
		System.out.println(owner);
		System.out.println(noOf4Wheels);
		System.out.println(noOf2Wheels);
		System.out.println(noOfElectrics);
	}

}
