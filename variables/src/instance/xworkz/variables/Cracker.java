package instance.xworkz.variables;

import instance.xworkz.constants.ColorOfCracker;

public class Cracker {
	
	public static String brand;
	public String type;
	public ColorOfCracker color = ColorOfCracker.RED;
	public boolean makingSound = false;
	public double price;
	public int quantity;
	
	public Cracker (String type)
	{
		this.type = type;
		System.out.println("Cracker constructor....");
	}
	
	public void setPrice(double price)
	{
		this.price = price;
		System.out.println("Cracker instance method");
	}
	
	public void display()
	{
		System.out.println("The brand of the cracker is : " + brand);
		System.out.println("The type of the cracker is : " + this.type);
		System.out.println("The making sound of the cracker is : " + this.makingSound);
		System.out.println("The price of the cracker is : " + this.price);
		System.out.println("The quantity of the cracker is : " + this.quantity);
		System.out.println("the color of the cracker is : " +this.color);
	}
	
	static
	{
		brand = "Venkat sai crackers";
	}

}
