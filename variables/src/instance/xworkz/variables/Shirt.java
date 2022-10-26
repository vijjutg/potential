package instance.xworkz.variables;

public class Shirt {
	
	public static String brand;
	public double price;
	public int quantity = 10;
	public String color;
	public boolean fullSleaves;
	
	public Shirt(boolean fullSleaves)
	{
		this.fullSleaves = fullSleaves;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void display()
	{
		System.out.println("The brand name of shirt is : "+ brand);
		System.out.println("The price  of shirt is : "+ this.price);
		System.out.println("The quantity name of shirt is : "+ this.quantity);
		System.out.println("The color name of shirt is : "+ this.color);
		System.out.println("The type of shirt is : "+ this.fullSleaves);
	}
	
	static
	{
		brand = "Adidas";
	}


}
