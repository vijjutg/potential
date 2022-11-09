package com.xworkz.inheritance.custom;

public class PoliticalParty {
	
	public String partyPresident;
	public String officeLocation;
	
	public PoliticalParty(String partyPresident, String officeLocation) {
		super();
		this.partyPresident = partyPresident;
		this.officeLocation = officeLocation;
	}
	
	public void display()
	{
		System.out.println(this.officeLocation);
		System.out.println(this.partyPresident);
	}
}
