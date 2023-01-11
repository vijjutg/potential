package com.xworkz.autowire.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	
	@Autowired
	@Qualifier("nameOfSoftware")
	private String name;
	
	@Autowired
	@Qualifier("softwareVersion")
	private double version;
	
	@Autowired
	@Qualifier("developerName")
	private String developer;
	
	@Autowired
	@Qualifier("dateOfRelease")
	private String date;
	
	@Autowired
	@Qualifier("isFree")
	private boolean free;

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}

}
