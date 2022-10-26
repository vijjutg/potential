package instance.xworkz.boot;

import instance.xworkz.variables.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		
		Milk milk = new Milk(5);
		
		milk.setManDate(27);
		
		milk.price = 20;
		
		milk.show();

	}

}
