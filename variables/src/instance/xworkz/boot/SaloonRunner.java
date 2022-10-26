package instance.xworkz.boot;

import instance.xworkz.variables.Saloon;

public class SaloonRunner {

	public static void main(String[] args) {
		
		String[] services = {"Hair cut", "Head massage", "Hair color"};
		
		Saloon saloon = new Saloon(services);
		
		saloon.setnoOfStaffs(5);
		
		saloon.avgIncome = 20000;
		
		saloon.show();

	}

}
