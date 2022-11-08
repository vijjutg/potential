package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Marriage;

public class arrangeMarriage extends Marriage{
	
	public arrangeMarriage(String venue, int date, String brideName) {
		super(venue, date, brideName);
	}

	Marriage marriage = new arrangeMarriage("Bangalore", 21, "Bhagya");

}
