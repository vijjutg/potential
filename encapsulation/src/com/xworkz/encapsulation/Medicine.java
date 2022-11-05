package com.xworkz.encapsulation;

public class Medicine {

	Hospital h1 = new Hospital();

	int number = h1.noOfWards;

	String doctor = h1.mainDoctor;

	boolean test = h1.bloodTest;

	int patients = h1.noOfPatients;

	double bill = h1.oneDayBill;

	long phone = h1.contactNo;

	public void display() {
		System.out.println(number);
		System.out.println(doctor);
		System.out.println(test);
		System.out.println(bill);
		System.out.println(number);
		System.out.println(phone);
	}

}
