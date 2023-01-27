package com.xworkz.boot;

import com.xworkz.methodconst.Boat;

public class BoatRunner {

	public static void main(String[] args) {
		
		Boat boat = new Boat();
		System.out.println("The name of the boat is : "+ boat.name);
		System.out.println("The color of the boat is : "+ boat.color);
		System.out.println("The name of the boat is : "+ boat.companyName);
		System.out.println("The name of the boat is : "+ boat.type);
		System.out.println("The name of the boat is : "+ boat.owner);
		
		Boat boat1 = new Boat("Reel Dream'n");
		System.out.println("The name of the boat is : "+ boat1.name);
		System.out.println("The color of the boat is : "+ boat1.color);
		System.out.println("The name of the boat is : "+ boat1.companyName);
		System.out.println("The name of the boat is : "+ boat1.type);
		System.out.println("The name of the boat is : "+ boat1.owner);
		
		Boat boat2 = new Boat("Reel Dream'n","White");
		System.out.println("The name of the boat is : "+ boat2.name);
		System.out.println("The color of the boat is : "+ boat2.color);
		System.out.println("The name of the boat is : "+ boat2.companyName);
		System.out.println("The name of the boat is : "+ boat2.type);
		System.out.println("The name of the boat is : "+ boat2.owner);
		
		Boat boat3 = new Boat("Reel Dream'n","White", "Seaworthy Boats");
		System.out.println("The name of the boat is : "+ boat3.name);
		System.out.println("The color of the boat is : "+ boat3.color);
		System.out.println("The name of the boat is : "+ boat3.companyName);
		System.out.println("The name of the boat is : "+ boat3.type);
		System.out.println("The name of the boat is : "+ boat3.owner);
		
		Boat boat4 = new Boat("Reel Dream'n","White", "Seaworthy Boats", "Big");
		System.out.println("The name of the boat is : "+ boat4.name);
		System.out.println("The color of the boat is : "+ boat4.color);
		System.out.println("The name of the boat is : "+ boat4.companyName);
		System.out.println("The name of the boat is : "+ boat4.type);
		System.out.println("The name of the boat is : "+ boat4.owner);
		
		Boat boat5 = new Boat("Reel Dream'n","White", "Seaworthy Boats", "Big", "Pamela");
		System.out.println("The name of the boat is : "+ boat5.name);
		System.out.println("The color of the boat is : "+ boat5.color);
		System.out.println("The name of the boat is : "+ boat5.companyName);
		System.out.println("The name of the boat is : "+ boat5.type);
		System.out.println("The name of the boat is : "+ boat5.owner);
		
	}

}
