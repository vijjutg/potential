package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.subclass.Moon;

public class SatelliteRunner {
	
	public static void main(String[] args) {
	
	Moon moon = new Moon("Moon", "White", true);
	
	moon.display();
	}

}
