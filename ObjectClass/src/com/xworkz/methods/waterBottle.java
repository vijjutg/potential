package com.xworkz.methods;

public class waterBottle {
	
	private String name;
	private double price;
	private String color;
	private String shape;
	private boolean quality;
	private int quantity;
	private double capacity;
	private String userName;
	private boolean portable;
	private double height;
	
	public waterBottle() {
		System.out.println("Default const of water bottle..");
	}

	public waterBottle(String color, String shape, boolean portable) {
		super();
		this.color = color;
		this.shape = shape;
		this.portable = portable;
	}

	@Override
	public String toString() {
		return "waterBottle [color=" + color + ", shape=" + shape + ", portable=" + portable + "]";
	}
	
	@Override
	public boolean equals(Object other) {
		System.out.println("Equal method overridden..");
		if(other instanceof waterBottle) {
			System.out.println("other is instance of water bottle, check the properties..");
			waterBottle cast = (waterBottle) other;
			if(this.color.equals(cast.color) && this.shape.equals(cast.shape) && this.portable == cast.portable) {
				System.out.println("Both objects are equal..");
				return true;
			}
		}
		else {
			System.err.println("other is not instance of water bottle");
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isPortable() {
		return portable;
	}

	public void setPortable(boolean portable) {
		this.portable = portable;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
