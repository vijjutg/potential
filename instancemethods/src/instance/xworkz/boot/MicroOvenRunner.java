package instance.xworkz.boot;

import instance.xworkz.instancemethods.MicroOven;

public class MicroOvenRunner {

	public static void main(String[] args) {

		String[] models = { "30 MCGR Deluxe", "PSRT" };

		String[] colors = { "Black", "White" };

		double[] capacity = { 92.4, 24.7 };

		double[] widths = { 38, 8, 3 };

		double[] weight = { 29.3, 20 };

		boolean[] isHeat = { true, false, true };

		MicroOven microoven = new MicroOven(models, "Goutham Gouda", "Morphy Richards", colors, "Countertop", capacity,
				30000, widths, weight, 4, isHeat);
		
		microoven.display();

	}

}
