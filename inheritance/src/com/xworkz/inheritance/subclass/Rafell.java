package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.WarJet;

public class Rafell extends WarJet{
	
	@Override
	public void protect()
	{
		super.protect();
		System.out.println("Running protect from Rafell..");
	}

}
