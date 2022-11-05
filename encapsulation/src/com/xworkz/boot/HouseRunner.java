package com.xworkz.boot;

import com.xworkz.encapsulation.Family;
import com.xworkz.encapsulation.House;

public class HouseRunner {

	public static void main(String[] args) {

		Family fam = new Family();

		fam.display();

		House house = new House();

		house.setBudget(15);

		house.setOwnerName("Sathish");

		System.out.println(house.getBudget());

		System.out.println(house.getOwnerName());

		house.color = "Red";

		house.compound = true;

		house.grandParentsAlive = true;

		house.noOfRooms = 4;

		System.out.println(house.color);

		System.out.println(house.compound);

		System.out.println(house.grandParentsAlive);

		System.out.println(house.noOfRooms);

	}

}
