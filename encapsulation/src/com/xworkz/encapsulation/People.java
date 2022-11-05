package com.xworkz.encapsulation;

public class People {

	Village man = new Village();

	String nameOfVillage = man.name;

	String talukIs = man.taluk;

	String districtIs = man.district;

	double area = man.totalArea;

	long noOfPeople = man.population;

	int families = man.noOfFamilies;

	public void display() {

		System.out.println(nameOfVillage);
		System.out.println(talukIs);
		System.out.println(districtIs);
		System.out.println(area);
		System.out.println(noOfPeople);
		System.out.println(families);
	}

}
