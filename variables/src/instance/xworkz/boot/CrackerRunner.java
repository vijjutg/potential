package instance.xworkz.boot;

import instance.xworkz.variables.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {
		
		Cracker cracker = new Cracker("Flower pot");
		
		cracker.setPrice(500);
		
		cracker.quantity = 8;
		
		cracker.display();

	}

}
