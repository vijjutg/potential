package com.xworkz.initvars.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	
	@Value("India")
	private String country;
	@Value("Aryabhata")
	private String name;
	@Value("27.5")
	private double budget;
	
	public Rocket() {
		
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

}
