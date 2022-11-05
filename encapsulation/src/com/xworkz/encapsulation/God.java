package com.xworkz.encapsulation;

public class God {
	
	Temple temp = new Temple();
	
	String name = temp.godName;
	
	String place = temp.location;
	
	String special = temp.spcial;
	
	int number = temp.noOfGods;
	
	int year = temp.constYear;
	
	public void display()
	{
		System.out.println(name);
		System.out.println(place);
		System.out.println(special);
		System.out.println(number);
		System.out.println(year);
	}

}
