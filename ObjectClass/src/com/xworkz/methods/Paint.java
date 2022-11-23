package com.xworkz.methods;

public class Paint {

	private String brand;
	private double price;
	private int quantity;
	private boolean quality;
	private String usedFor;
	private String color;
	private double weigth;
	private int manDate;
	private String symbol;
	private String ingredient;

	public Paint() {
		System.out.println("Defualt constructor of paint...");
	}

	public Paint(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Paint [brand=" + brand + "]";
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("Equal method overridden");
		if (other instanceof Paint) {
            System.out.println("Other is insatce of Paint, check properties..");
            Paint cast = (Paint) other;
            if(this.brand.equals(cast.brand)) {
            	System.out.println("Both are equal...");
            	return true;
            }
		}
		else {
			System.out.println("other is not instance of paint..");
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public int getManDate() {
		return manDate;
	}

	public void setManDate(int manDate) {
		this.manDate = manDate;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

}
