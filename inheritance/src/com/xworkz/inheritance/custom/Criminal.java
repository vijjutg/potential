package com.xworkz.inheritance.custom;

public class Criminal {
	
	public String name;
	public int age;
	
	
	public Criminal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void display()
	{
		System.out.println(this.age);
		System.out.println(this.name);
	}

}
