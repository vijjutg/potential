package com.xworkz.springassociation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.springassociation.rules.Browser;
import com.xworkz.springassociation.rules.Provider;

@Component
public class FireBox implements Browser {
	
	@Autowired
	@Qualifier("jio")
	private Provider provide;
	
	@Override
	public void browse() {
		System.out.println("Running browse in firebox..");
		provide.connect();
	}

}
