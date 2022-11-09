package com.xworkz.inheritance.custom;

public class Satellite {
	
	public String name;
	public String color;
	
	public Satellite(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.color);
	}

}
