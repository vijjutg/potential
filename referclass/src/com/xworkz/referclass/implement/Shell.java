package com.xworkz.referclass.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.referclass.interfaces.Fuel;
import com.xworkz.referclass.interfaces.PetrolBunk;

@Component
public class Shell implements PetrolBunk {

	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;
	
	@Override
	public void purchase() {
		System.out.println("Running purchase method.....");
		fuel.consume();
	}

}
