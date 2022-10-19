package instance.xworkz.boot;

import instance.xworkz.instancemethods.Geyser;

public class GeyserRunner {

	public static void main(String[] args) {

		String[] brands = { "Racold", "Godrej" };

		double[] lengths = { 8.4, 2.75, 8.6 };

		double[] weights = { 93.4, 39.8 };

		double[] heights = { 3.5, 3.95 };

		String[] colors = { "Black", "White" };

		double[] price = { 7457, 8600 };

		Geyser geyser = new Geyser(brands, 15, lengths, weights, heights, colors, 2000, "Plastic", price, 16.86, true);

		geyser.display();

	}

}
