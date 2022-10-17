package com.xworkz.constructor;

public class TextileShop {

	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public int ownerNoOfWifes;
	public int shopNo;
	public long contactNo;

	public TextileShop() {
		System.out.println("Entered textile shop default constructor...");
	}
	
	public TextileShop(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("Entered textile shop constructor using owner name...");
	}
	
	public TextileShop(String ownerName, String ownerWifeName) {
		this(ownerName);
		this.ownerWifeName = ownerWifeName;
		System.out.println("Entered textile shop constructor using owner name and owner wife name...");
	}
	
	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName) {
		this(ownerName,ownerWifeName);
		this.ownerDaughterName = ownerDaughterName;
		System.out.println("Entered textile shop constructor using owner name, owner wife name and owner daughter name...");
	}
	
	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, int ownerNoOfWifes) {
		this(ownerName,ownerWifeName,ownerDaughterName);
		this.ownerNoOfWifes = ownerNoOfWifes;
		System.out.println("Entered textile shop constructor using owner name, owner wife name, owner daughter name ...");
	}
	
	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, int ownerNoOfWifes, int shopNo) {
		this(ownerName,ownerWifeName,ownerDaughterName,ownerNoOfWifes);
		this.shopNo = shopNo;
		System.out.println("Entered textile shop constructor using owner name, owner wife name, owner daughter name, ...");
	}
	
	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, int ownerNoOfWifes, int shopNo, long contactNo) {
		this(ownerName,ownerWifeName,ownerDaughterName,ownerNoOfWifes,shopNo);
		this.contactNo = contactNo;
		System.out.println("Entered textile shop constructor using owner name...");
	}

}
