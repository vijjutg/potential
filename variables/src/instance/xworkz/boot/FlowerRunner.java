package instance.xworkz.boot;

import instance.xworkz.variables.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
		
		Flower flower = new Flower(50);
		flower.setQuantity(56);
		flower.fresh = true;
		flower.display();

	}

}
