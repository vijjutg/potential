package com.xworkz.encapsulation;

public class Police {

	PoliceStation station = new PoliceStation();

	String area = station.area;

	String location = station.location;

	int noOfStaff = station.noOfStaff;

	String headName = station.headName;

	long contactNo = station.contactNo;

	public void display() {
		System.out.println(area);
		System.out.println(location);
		System.out.println(noOfStaff);
		System.out.println(headName);
		System.out.println(contactNo);
	}

}
