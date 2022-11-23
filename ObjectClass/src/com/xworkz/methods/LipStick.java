package com.xworkz.methods;

public class LipStick {
	
	private String brand;
	private double price;
	private int quantity;
	private int manDate;
	private int expDate;
	private String productCode;
	private double netWeight; 
	private boolean quality;
	private double height;
	private String color;
	
	public LipStick() {
		System.out.println("Default const in lipstick..");
	}

	public LipStick(String brand, double price, int quantity, int manDate, String productCode, double netWeight,
			boolean quality, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.manDate = manDate;
		this.productCode = productCode;
		this.netWeight = netWeight;
		this.quality = quality;
		this.color = color;
	}

	@Override
	public String toString() {
		return "LipStick [brand=" + brand + ", price=" + price + ", quantity=" + quantity + ", manDate=" + manDate
				+ ", productCode=" + productCode + ", netWeight=" + netWeight + ", quality=" + quality + ", color="
				+ color + "]";
	}
	
	@Override
	public boolean equals(Object other) {
		System.out.println("Equal method overridden..");
		if(other instanceof LipStick) {
			
			System.out.println("other is instance of LipStick, check the properties..");
			LipStick cast = (LipStick) other;
			if(this.brand.equals(cast.brand) && this.price==cast.price && this.quantity==cast.quantity && this.manDate == cast.manDate )  { 
				
					if( this.productCode == cast.productCode && this.netWeight==cast.netWeight && this.quality==cast.quality && this.color.equals(cast.color)) {
				    System.out.println("Both objects are equal..");
				   return true;
			      }
			}
		}
		else {
			System.err.println("other is not instance of LipStick");
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

	public int getManDate() {
		return manDate;
	}

	public void setManDate(int manDate) {
		this.manDate = manDate;
	}

	public int getExpDate() {
		return expDate;
	}

	public void setExpDate(int expDate) {
		this.expDate = expDate;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public double getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(double netWeight) {
		this.netWeight = netWeight;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
