package com.xworkz.task.abstrctclass;

import com.xworkz.task.base.KarnatakaRTO;

public class Vijayalakshmi extends JavaTrainee implements KarnatakaRTO{

	public Vijayalakshmi(String name, String place, int age, String gender, double height) {
		super(name, place, age, gender, height);
		System.out.println(name);
		System.out.println(place);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(height);
	}

	@Override
	public boolean paidTax(double tax) {
		System.out.println("Running paid tax...");
		return false;
	}

	@Override
	public double gst() {
		System.out.println("Running gst...");
		return 0;
	}

	@Override
	public double vat() {
		System.out.println("Running vat...");
		return 0;
	}

	@Override
	public int training() {
		System.out.println("Running training...");
		return 0;
	}

	@Override
	public boolean executeProgram() {
		System.out.println("Running execute program...");
		return false;
	}
	
}
