package com.xworkz.methodconst;

public class PassPort {

	public long number;
	public String name;
	public int expDate;
	public String country;
	public int issuedDate;
	public int noOfLeafes;

	public PassPort() {
		System.out.println("Entered no args constructor....");
	}

	public PassPort(long number) {
		this.number = number;
		System.out.println("Entered Passport using number..");
	}

	public PassPort(String name) {
		this.name = name;
		System.out.println("Entered Passport using name..");
	}

	public PassPort(int expDate) {
		this.expDate = expDate;
		System.out.println("Entered Passport using expDate..");
	}

	public PassPort(String country, int issuedDate) {
		this.country = country;
		this.issuedDate = issuedDate;
		System.out.println("Entered Passport using country and issued date..");
	}

	public PassPort(long number, String name) {
		this.number = number;
		this.name = name;
		System.out.println("Entered Passport using number and name..");
	}

	public PassPort(int noOfLeafes, long number) {
		this.number = number;
		this.noOfLeafes = noOfLeafes;
		System.out.println("Entered Passport using number and NoOfLeafes..");
	}

	public PassPort(String country, int issuedDate, long number) {
		this.country = country;
		this.issuedDate = issuedDate;
		this.number = number;
		System.out.println("Entered Passport using country,number and issued date..");
	}

}
