package com.xworkz.methodconst;

public class Bread {

	public String type;
	public String shape;
	public double price;
	public int quantity;
	public String companyName;

	public Bread() {
		System.out.println("Entered no args constructor....");
	}

	public Bread(String type, String shape) {
		this.type = type;
		this.shape = shape;
		System.out.println("Entered Bread using type and shape....");
	}

	public Bread(double price, String shape) {
		this.price = price;
		this.shape = shape;
		System.out.println("Entered Bread using price and shape....");
	}

	public Bread(int quantity, double price) {
		this.quantity = quantity;
		this.price = price;
		System.out.println("Entered Bread using type and shape....");
	}

	public Bread(int quantity, String shape) {
		this.quantity = quantity;
		this.shape = shape;
		System.out.println("Entered Bread using type and shape....");
	}

	public Bread(String shape, int quantity, double price) {
		this.shape = shape;
		this.quantity = quantity;
		this.price = price;
		System.out.println("Entered Bread using shape,type and price....");
	}

	public Bread(double price, String companyName, String shape) {
		this.price = price;
		this.companyName = companyName;
		this.shape = shape;
		System.out.println("Entered Bread using price,companyName and shape....");
	}

	public Bread(double price, String companyName, String shape, String type) {
		this.price = price;
		this.companyName = companyName;
		this.shape = shape;
		this.type = type;
		System.out.println("Entered Bread using price,companyName,shape and shape....");
	}

}
