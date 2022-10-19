package instance.xworkz.boot;

import instance.xworkz.instancemethods.Mixie;

public class MixieRunner {

	public static void main(String[] args) {

		String[] color = { "White", "Red"};
		
		String[] material = { "Plastic", "Steel"};
		
		int[] number = { 3,2,4};
		
		double[] price = {29733, 9373};
		
		int[] stars = {3,4,5};
		
		long[] codes = {92740l, 29283700l};
		
		Mixie mixie = new Mixie("Croma", color, material, "Stainless Steel", number, 230, 3, price, true, stars, codes);
		
		mixie.display();

	}

}
