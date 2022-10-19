package instance.xworkz.boot;

import instance.xworkz.instancemethods.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {
		
		String[] brand = {"Samsung", "Bajaj"};
		
		String[] clrs = {"Grey", "Black", "White"};
		
		double[] meters = {83.3, 65.2, 29.8};
		
		double[] kgs = {27.7, 82.7};
		
		int[] noDoor = {2, 1, 3};
		
		long[] number = {93701129l, 287103810l};
		
		Fridge fridge = new Fridge(brand,clrs, "Freezer on top", meters, kgs, 192, noDoor, false, number,7500.0, 5);
		
		fridge.display();

	}

}
