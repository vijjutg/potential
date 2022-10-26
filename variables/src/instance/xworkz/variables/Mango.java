package instance.xworkz.variables;

import instance.xworkz.constants.ColorOfMango;

public class Mango {

	public static String breed;
	public double price = 150;
	public int quantity;
	public ColorOfMango color;
	public String measuringType;
	public boolean riped;

	public Mango(int quantity) {
		this.quantity = quantity;
	}

	public void setMeasuringType(String measuringType) {
		this.measuringType = measuringType;
	}

	public void show() {
		System.out.println("The breed of the Mango is : " + breed);
		System.out.println("The price of the Mango is : " + this.price);
		System.out.println("The quantity of the Mango is : " + this.quantity);
		System.out.println("The color of the Mango is : " + ColorOfMango.YELLOW);
		System.out.println("The measuring type of the Mango is : " + this.measuringType);
		System.out.println("The Mango is riped : " + this.riped);
	}

	static {
		
		breed = "Rasapuri";

	}

}
