package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Party;

public class BirthDayparty extends Party{
	
	public BirthDayparty(String location, String name, double budget) {
		super(location, name, budget);
		// TODO Auto-generated constructor stub
	}

	Party party = new BirthDayparty("Hosapete","Akash",10000);
	

}
