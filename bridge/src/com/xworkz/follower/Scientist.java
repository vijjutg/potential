package com.xworkz.follower;

import com.xworkz.bridge.Science;

public class Scientist implements Science{

	public static void main(String[] args) {
		
		Science science = new Scientist();
		
		System.out.println(science.observation());
		System.out.println(science.research());
		System.out.println(science.hypothesis());
		System.out.println(science.experiment());
		System.out.println(science.analyze());
		
		Scientist scientist = new Scientist();
		
		System.out.println(scientist.observation());
		System.out.println(scientist.research());
		System.out.println(scientist.hypothesis());
		System.out.println(scientist.experiment());
		System.out.println(scientist.analyze());

	}

	@Override
	public boolean observation() {
		System.out.println("Running observation method..");
		return false;
	}

	@Override
	public String research() {
		System.out.println("Running research method..");
		return null;
	}

	@Override
	public char hypothesis() {
		System.out.println("Running hypothesis method..");
		return 0;
	}

	@Override
	public int experiment() {
		System.out.println("Running experiment method..");
		return 0;
	}

	@Override
	public double analyze() {
		System.out.println("Running analyze method..");
		return 0;
	}

}
