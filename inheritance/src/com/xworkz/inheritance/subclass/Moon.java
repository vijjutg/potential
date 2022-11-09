package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Satellite;

public class Moon extends Satellite{
	
	public boolean natural;

	public Moon(String name, String color) {
		super(name, color);
	}

	public Moon(String name, String color, boolean natural) {
		super(name, color);
		this.natural = natural;
	}
	
	public void display()
	{
		super.display();
		System.out.println(this.natural);
	}

}
