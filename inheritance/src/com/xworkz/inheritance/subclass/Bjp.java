package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.PoliticalParty;

public class Bjp extends PoliticalParty{
	
	public String partySymbol;

	public Bjp(String partyPresident, String officeLocation) {
		super(partyPresident, officeLocation);
	}

	public Bjp(String partyPresident, String officeLocation, String partySymbol) {
		super(partyPresident, officeLocation);
		this.partySymbol = partySymbol;
	}
	
	public void display()
	{
		super.display();
		System.out.println(this.partySymbol);
	}
	
}
