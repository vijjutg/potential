package instance.xworkz.variables;

import instance.xworkz.constants.StatesOfMilk;

public class Milk {
	
	public static String brand;
	public double price;
	public int quantity;
	public int manDate;
	public StatesOfMilk physicalState;
	public boolean fresh = true;
	
	public Milk(int quantity) {
		this.quantity = quantity;
	}

	public void setManDate(int manDate) {
		this.manDate = manDate;
	}

	public void show() {
		System.out.println("The brand of the Milk is : " + brand);
		System.out.println("The price of the Milk is : " + this.price);
		System.out.println("The quantity of the Mango is : " + this.quantity);
		System.out.println("The physical State of the milk is : " +StatesOfMilk.LIQUID);
		System.out.println("The manDate of the milk is : " + this.manDate);
		System.out.println("The milk is fresh : " + this.fresh);
	}

	static {
		
		brand = "Nandini";

	}


}
