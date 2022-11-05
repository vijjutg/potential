package com.xworkz.encapsulation;

public class Backary {
	
	public String name;
	public String owner;
	public String location;
	public int noOfVarieties;
	boolean cake = true;
	String typeOfCake = "Pastrie";
	String ingredientOfCake = "Cream";
	double PriceOfCake = 500;
	double areaOfBackary = 33.4;
	private boolean spicySnacks;
	private String mainSpiceItem;
	
	public void setMainSpiceItem(String mainSpiceItem) {
		this.mainSpiceItem = mainSpiceItem;
	}

	public String getMainSpiceItem() {
		return mainSpiceItem;
	}

	public void setSpicySnacks(boolean spicySnacks) {
		this.spicySnacks = spicySnacks;
	}

	public boolean getSpicySnacks() {
		return spicySnacks;
	}

}
