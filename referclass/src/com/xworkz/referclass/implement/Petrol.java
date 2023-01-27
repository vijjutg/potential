package com.xworkz.referclass.implement;

import org.springframework.stereotype.Component;

import com.xworkz.referclass.interfaces.Fuel;

@Component
public class Petrol implements Fuel {

	@Override
	public void consume() {
		System.out.println("Running consume method in petrol....");
		
	}

}
