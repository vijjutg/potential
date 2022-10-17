package com.xworkz.constructor;

public class Tractor {

	public String name;
	public String brand;
	public double price;
	public String color;
	public double hp;
	public String model;

	public Tractor() {
		System.out.println("Entered no args constructor");
	}

	public Tractor(String name) {
		this();
		this.name = name;
		System.out.println("Entered constructor with name..");
	}

	public Tractor(String name, String brand) {
		this(name);
		this.brand = brand;
		System.out.println("Entered constructor with name and brand..");
	}

	public Tractor(String name, String brand,double price) {
		this(name,brand);
		this.price = price;
		System.out.println("Entered constructor with name, brand and price..");
	}

	public Tractor(String name, String brand, double price, String color) {
		this(name,brand,price);
		System.out.println("Entered constructor with name, brand, price and color..");
	}

	public Tractor(String name, String brand, double price, String color, double hp) {
		this(name, brand, price, color);
		System.out.println("Entered constructor with name, brand, price, color and hp..");
	}

	public Tractor(String name, String brand, double price, String color, double hp, String model) {
		this(name, brand, price, color, hp);
		System.out.println("Entered constructor with name, brand, price, color, hp and model..");
	}

}
