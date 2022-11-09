package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.ShoppingMall;

public class Orion extends ShoppingMall{
	
	public int noOfFloors;
	
	public Orion(String name, String location) {
		super(name, location);
	}
	
	public Orion(String name, String location, int noOfFloors) {
		super(name, location);
		this.noOfFloors = noOfFloors;
	}



	public void display()
	{
		super.display();
		System.out.println(this.noOfFloors);
	}
}
