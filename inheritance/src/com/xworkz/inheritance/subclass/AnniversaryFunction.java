package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Catering;

public class AnniversaryFunction extends Catering{
	
	public AnniversaryFunction(String serviceType, int noOfStrength, String sweetName) {
		super(serviceType, noOfStrength, sweetName);
	}

	Catering cat = new AnniversaryFunction("Buffet",9270, "Jamun");

}
