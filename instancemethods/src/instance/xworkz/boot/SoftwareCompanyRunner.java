package instance.xworkz.boot;

import instance.xworkz.instancemethods.SoftwareComapny;

import instance.xworkz.instancemethods.Position;

public class SoftwareCompanyRunner {

	public static void main(String[] args) {

		String[] names = { "Goutham", "Akash", "Sathish" };

		double[] salary = { 3.5, 4.2, 6 };

		String[] namesNonTechnical = { "Bharath", "Manvita" };

		int[] numberOfStaffs = { 6, 4, 7 };

		int[] stars = { 4, 3, 5 };

		boolean[] opinion = { true, true, false };

		SoftwareComapny software = new SoftwareComapny("Accord Software", "Chandra Gupta", 78, 34, 7.8, names,
				Position.ASSOCIATE_SOFTWARE_ENGINEER, salary, namesNonTechnical,numberOfStaffs,stars,opinion);
		
		software.display();

	}
	
}
