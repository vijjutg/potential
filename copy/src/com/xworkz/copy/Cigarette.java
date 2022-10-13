package com.xworkz.copy;

public class Cigarette {
	
	public String name;
	public String brand;
	public String ingredient = "Tobacco leaf";
	public double price;
	public double weight = 25;
	public int quantity;
	public int manDate;
	public int manMonth;
	public long manYear = 2022l;
	public int expDate;
	public int expMonth;
	public long expYear = 2023l;
	public boolean isSafe = false;
	public String ownerName;
	public long noOfCigaretteLikers = 92784672l;
	public long noOfcigaretteHaters = 82478l;
	public String productCode = "FFYBUGHJF46gjs";
	public String manCountry = "England";
	
	public Cigarette()
	{
		System.out.println("Entered constructor.....");
	}

}
