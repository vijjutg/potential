package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Doctor;

public class Cardiologist extends Doctor {

	public boolean heartTransplant;
	public int noOfPatients;

	public Cardiologist() {

		System.out.println("Created Cardiologist constructor...");

	}

}
