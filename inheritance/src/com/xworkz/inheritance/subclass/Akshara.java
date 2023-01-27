package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.HumanResource;

public class Akshara extends HumanResource{
	
	@Override
	public void recruitment()
	{
		super.recruitment();
		System.out.println("Running recruiter from akshara....");
	}

}
