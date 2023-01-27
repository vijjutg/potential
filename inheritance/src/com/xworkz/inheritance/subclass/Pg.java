package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Home;

public class Pg extends Home{
	
	@Override
	public void staying()
	{
		super.staying();
		System.out.println("Running staying method from pg..");
	}

}
