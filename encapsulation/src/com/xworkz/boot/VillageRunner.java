package com.xworkz.boot;

import com.xworkz.encapsulation.People;
import com.xworkz.encapsulation.Village;

public class VillageRunner {

	public static void main(String[] args) {

		People people = new People();

		people.display();

		Village village = new Village();

		village.setPincode(583101);

		village.setVillageGod("Ganesh");

		System.out.println(village.getPincode());

		System.out.println(village.getVillageGod());

		village.waterFacility = false;

		village.mainPerson = "Kumar D";

		village.panchayat = true;

		System.out.println(village.waterFacility);

		System.out.println(village.panchayat);

		System.out.println(village.mainPerson);

	}

}
