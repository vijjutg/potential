package com.xworkz.encapsulation;

public class Cake {
	
	Backary backery = new Backary();
	
	boolean cake = backery.cake;
	
	String typeOfCake = backery.typeOfCake;
	
	String ingredientOfCake = backery.ingredientOfCake;
	
	double PriceOfCake = backery.PriceOfCake;
	
	double areaOfBackary = backery.areaOfBackary;
	
	public void display()
	{
		System.out.println(cake);
		System.out.println(typeOfCake);
		System.out.println(ingredientOfCake);
		System.out.println(PriceOfCake);
		System.out.println(areaOfBackary);
	}

}
