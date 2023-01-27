package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Terrorist;

public class Kasab extends Terrorist{
	
	@Override
	public void bombBlast()
	{
		super.bombBlast();
		System.out.println("Running bomb blast from kasab..");
	}

}
