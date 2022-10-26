package instance.xworkz.boot;

import instance.xworkz.variables.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
		
		Shirt shirt = new Shirt(true);
		
		shirt.setColor("Black");
		
		shirt.price =700;
		
		shirt.display();

	}

}
