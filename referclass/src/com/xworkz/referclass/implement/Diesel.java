package com.xworkz.referclass.implement;

import org.springframework.stereotype.Component;

import com.xworkz.referclass.interfaces.Fuel;

@Component
public class Diesel implements Fuel {

	@Override
	public void consume() {
		
		System.out.println("Running consume method in diesel...");
		
	}

}
