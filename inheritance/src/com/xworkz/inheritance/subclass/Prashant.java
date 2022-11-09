package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Director;

public class Prashant extends Director{
	
	public boolean scriptReady;

	public Prashant(String name, int age) {
		super(name, age);
	}

	public Prashant(String name, int age, boolean scriptReady) {
		super(name, age);
		this.scriptReady = scriptReady;
	}
	
	public void display()
	{
		super.display();
		System.out.println(this.scriptReady);
	}

}
