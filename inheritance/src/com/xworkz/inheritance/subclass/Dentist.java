package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Doctor;

public class Dentist extends Doctor {

	public String specialist;
	public String consultDay;

	public Dentist() {

		System.out.println("Created Dentist constructor...");
	}

}
