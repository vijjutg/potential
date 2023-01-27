package com.xworkz.methodconst;

public class Fish {
	
	public String name;
	public String type;
	public double price;
	public double weight;
	public double length;
	
	public Fish()
	{
		System.out.println("entered no args constructor..");
	}
	
	public Fish(String name, String type)
	{
		this.name = name;
		this.type = type;
		System.out.println("Entered the Fish using name and type...");
	}
	
	public Fish(String name, double price)
	{
		this.name = name;
		this.price = price;
		System.out.println("Entered the Fish using name and price...");
	}
	
	public Fish(double weight, String type)
	{
		this.weight = weight;
		this.type = type;
		System.out.println("Entered the Fish weight name and type...");
	}
	
	public Fish(String name, String type, double length)
	{
		this.name = name;
		this.type = type;
		this.length = length;
		System.out.println("Entered the Fish using name,type and length...");
	}
	
	public Fish(double price, double length, double weight)
	{
		this.price = price;
		this.length = length;
		this.weight =weight;
		System.out.println("Entered the Fish using price,length and weight...");
	}
	
	public Fish(String type, double weight,double price)
	{
		this.type = type;
		this.weight = weight;
		this.price = price;
		System.out.println("Entered the Fish using type,weight and price...");
	}
	
	public Fish(double price, String name, double length, String type, double weight)
	{
		this.price = price;
		this.name = name;
		this.length = length;
		this.type = type;
		this.weight = weight;
		System.out.println("Entered the Fish using price,name,length,type and weight...");
	}

}
