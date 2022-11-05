package com.xworkz.encapsulation;

public class Product {

	SuperMarket market = new SuperMarket();

	String shopName = market.name;

	String ownerName = market.owner;

	String place = market.location;

	int floor = market.noOfFloors;

	double cost = market.visitingPrice;

	int visitors = market.noOfVisitors;

	public void display() {
		System.out.println(shopName);
		System.out.println(ownerName);
		System.out.println(place);
		System.out.println(floor);
		System.out.println(cost);
		System.out.println(visitors);
	}

}
