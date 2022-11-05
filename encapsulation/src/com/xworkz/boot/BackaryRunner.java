package com.xworkz.boot;

import com.xworkz.encapsulation.Backary;
import com.xworkz.encapsulation.Cake;

public class BackaryRunner {

	public static void main(String[] args) {
		
		Cake cake = new Cake();
		
		cake.display();
		
		Backary bake = new  Backary();
		
		bake.setMainSpiceItem("Chips");
		
		bake.setSpicySnacks(true);
		
		System.out.println(bake.getMainSpiceItem());
		
		System.out.println(bake.getSpicySnacks());
		
		bake.location = "Bangalore";
		
		bake.name = "Aiyangar";
		
		bake.owner = "Akash";
		
		bake.noOfVarieties = 45;
		
		System.out.println(bake.location);
		System.out.println(bake.name);
		System.out.println(bake.noOfVarieties);
		System.out.println(bake.owner);

	}

}
