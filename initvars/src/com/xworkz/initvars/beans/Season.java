package com.xworkz.initvars.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	
	private String name;
	private int duration;
	private String startingMonth;
	
	public Season() {
		
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("Summer")
	public void setName(String name) {
		this.name = name;
	}

	@Value("4")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Value("March")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
}
