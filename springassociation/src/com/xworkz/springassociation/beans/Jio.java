package com.xworkz.springassociation.beans;

import org.springframework.stereotype.Component;

import com.xworkz.springassociation.rules.Provider;

@Component
public class Jio implements Provider {

	@Override
	public void connect() {
		System.out.println("Running connect in jio...");
	}

}
