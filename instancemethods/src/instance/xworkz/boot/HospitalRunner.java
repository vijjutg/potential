package instance.xworkz.boot;

import instance.xworkz.instancemethods.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {

		char[] character = { 'A', 'B', 'C' };
		String[] names = { "Sathish", "Goutham", "Kannika", "Akash" };
		String[] diseiesNames = { "Maleria", "Typhoid", "Cancer" };
		double[] bills = { 3755.3, 9267.4, 9268.8 };
		int[] guardians = { 3, 5, 2, 4 };
		long[] numbers = { 7022454703l, 826753752l, 915142812l };

		Hospital hospital = new Hospital("Suguna", true, 67, 30, 7.8, character, names, diseiesNames, bills, guardians,
				numbers);

		hospital.display();

	}

}
