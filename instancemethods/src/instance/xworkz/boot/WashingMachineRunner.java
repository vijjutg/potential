package instance.xworkz.boot;

import instance.xworkz.instancemethods.Rate;
import instance.xworkz.instancemethods.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		String[] brands = {"Croma", "Samsung"};
		
		String[] location = {"Top Load", "Side Load"};
		
		String[] color = {"white", "Black"};
		
		double[] price = {2300, 34000};
		
		double[] weight = {20, 23.5};
		
		int[] stars = {3,4,5};
		
		WashingMachine washingMachine = new WashingMachine(brands,location,color,"Input Buttons",230,"LED",price,weight,true,stars, Rate.BEST);
		
		washingMachine.display();

	}

}
