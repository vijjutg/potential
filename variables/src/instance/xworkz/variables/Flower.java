package instance.xworkz.variables;

import instance.xworkz.constants.MeasureFlower;

public class Flower {
	
	public static String name;
	public String color = "Yellow";
	public MeasureFlower measuringType;
	public double price;
	public int quantity;
	public boolean fresh;
	
	public Flower (double price)
	{
		this.price = price;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	static
	{
		name = "Marie Gold";
	}
	
	public void display()
	{
		System.out.println("The name of the flower : "+ name);
		System.out.println("The color of the flower : "+ this.color);
		System.out.println("The measuring type of the flower : " + MeasureFlower.KILOGRAM);
		System.out.println("The price of the flower : "+ this.price);
		System.out.println("The quantity of the flower : "+ this.quantity);
		System.out.println("The flower is fresh : "+ this.fresh);
	}

}
