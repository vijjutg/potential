package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.custom.Jail;
import com.xworkz.inheritance.subclass.*;

public class JailRunner {

	public static void main(String[] args) {
		
		Jail jail = new Jail();
		
		System.out.println(jail.location);
		System.out.println(jail.name);
		
		Jail jail1 = new CentralJail();
		
		CentralJail central = (CentralJail)jail1;
		
		System.out.println(central.noOfPrisoners);
		System.out.println(central.stateName);
		
		Jail Jail2 = new DistrictJail();
		
		DistrictJail district = (DistrictJail)Jail2;
		
		System.out.println(district.copName);
		System.out.println(district.noOfCells);
		
		Jail jail3 = new SubJail();
		
		SubJail sub = (SubJail)jail3;
		
		System.out.println(sub.duration);
		System.out.println(sub.underAge);

	}

}
