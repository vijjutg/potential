package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Invitation;

public class NamingCeremony extends Invitation{
	
	public NamingCeremony(String shape, double price, String color) {
		super(shape, price, color);
	}

	Invitation invite = new NamingCeremony("Square",4.5,"Red");

}
