package com.xworkz.encapsulation;

public class Family {

	House home = new House();

	String name = home.name;

	int noOfMembres = home.noOfMembres;

	long landline = home.landline;

	String location = home.location;

	int noOfchilds = home.noOfchilds;

	public void display() {
		System.out.println(name);
		System.out.println(noOfMembres);
		System.out.println(landline);
		System.out.println(location);
		System.out.println(noOfchilds);
	}

}
