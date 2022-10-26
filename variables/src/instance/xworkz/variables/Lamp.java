package instance.xworkz.variables;

import instance.xworkz.constants.Voltage;

public class Lamp {
	
	public static String name;
	public String color;
	public double price;
	public int quantity = 10;
	public Voltage voltage;
	public boolean isOn;
	
	public Lamp (String color)
	{
		this.color = color;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void display()
	{
		System.out.println("The name of the lamp is : " + name);
		System.out.println("The color of the lamp is : " + this.color);
		System.out.println("The price of the lamp is : " + this.price);
		System.out.println("The quantity of the lamp is : " + this.quantity);
		System.out.println("The voltage of the lamp is : " + Voltage.TEN);
		System.out.println("the lamp is on : " +this.isOn);
	}
	
	static
	{
		name = "Hustlezy";
	}

}
