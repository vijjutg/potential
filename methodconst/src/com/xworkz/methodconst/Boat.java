package com.xworkz.methodconst;

public class Boat {
	
	public String name;
	public String color;
	public String companyName;
	public String type;
	public String owner;
	
	public Boat()
	{
		System.out.println("Entered no ags Constructor");
	}
	
	public Boat(String name)
	{
		this.name = name;
		System.out.println("Entered Boat using name....");
	}
	
	public Boat(String name, String color)
	{
		this.name = name;
		this.color = color;
		System.out.println("Entered Boat using name and color....");
	}
	
	public Boat(String name, String color, String companyName)
	{
		this.name = name;
		this.color = color;
		this.companyName = companyName;
		System.out.println("Entered Boat using name,color and companyName....");
	}
	
	public Boat(String name, String color, String companyName, String type)
	{
		this.name = name;
		this.color = color;
		this.companyName = companyName;
		this.type = type;
		System.out.println("Entered Boat using name,color,companyName and type....");
	}
	
	public Boat(String name, String color, String companyName, String type, String owner)
	{
		this.name = name;
		this.color = color;
		this.companyName = companyName;
		this.type = type;
		this.owner = owner;
		System.out.println("Entered Boat using name,color,companyName,type and owner....");
	}


}
