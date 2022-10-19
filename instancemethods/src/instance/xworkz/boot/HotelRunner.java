package instance.xworkz.boot;

import instance.xworkz.instancemethods.Hotel;

public class HotelRunner {

	public static void main(String[] args) {

		String[] tiffins = { "Idli", "Dosa", "Poori" };

		String[] lunchs = { "Chapathi", "Roti", "Rice Sambar" };

		String[] servers = { "Akash", "Mani", "Mohan" };

		int[] tables = { 4, 8, 19 };

		int[] visitors = { 83, 87, 23 };

		double[] bills = { 273.9, 2990, 290 };

		Hotel hotel = new Hotel("Manjunatha Kanawali", tiffins, lunchs, servers, tables, visitors, bills, true, false,
				"Vidarsh", true);

		hotel.display();

	}

}
