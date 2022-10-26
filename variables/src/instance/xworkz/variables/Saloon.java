package instance.xworkz.variables;

import instance.xworkz.constants.Ratings;

public class Saloon {
	
	public static String name;
	public String ownerName = "Sathish";
	public String[] services;
	public int noOfStaffs;
	public double avgIncome;
	public Ratings stars;
	
	public Saloon(String[] services) {
		this.services = services;
	}

	public void setnoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	public void show() {
		System.out.println("The name of the Saloon is : " + name);
		System.out.println("The owner name of the saloon is : " + this.ownerName);
		System.out.println("The number of staffs in the saloon is : " + this.noOfStaffs);
		System.out.println("The average income of the saloon is : " + this.avgIncome);
		System.out.println("The Ratings of the saloon is : " + Ratings.FOUR);
		
		for (int i = 0; i < services.length; i++) {
			String string = services[i];
			System.out.println("The services provided are : " + string);
		}
	}

	static {
		name = "Style maker saloon";
	}

}
