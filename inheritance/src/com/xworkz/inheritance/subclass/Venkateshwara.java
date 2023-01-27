package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.PetrolBunk;

public class Venkateshwara extends PetrolBunk{
	
	@Override
	public void fullTank()
	{
		super.fullTank();
		System.out.println("Runninf fulltank from vekateshwara..");
	}

}
