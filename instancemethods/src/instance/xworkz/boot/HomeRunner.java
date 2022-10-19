package instance.xworkz.boot;

import instance.xworkz.instancemethods.Home;

public class HomeRunner {

	public static void main(String[] args) {

		String[] names = { "Vijayalakshmi", "Bhagya", "Druva" };

		String[] children = { "Druva", "Bharath" };

		String[] adults = { "Shruthi", "Suma" };

		int[] age = { 2, 4 };

		double[] height = { 2.4, 8.5, 3.5 };

		double[] weight = { 28.3, 38.4 };

		Home home = new Home("Veerabadreshwara Nilaya", names, 2, 3, 3540000, children, adults, 4, age, height, weight);

		home.display();

	}

}
