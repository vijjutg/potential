package com.xworkz.follower;

import com.xworkz.bridge.Constitution;

public class Citizen implements Constitution{

	public static void main(String[] args) {
		
		Constitution rules = new Citizen();
		
		System.out.println(rules.written());
		System.out.println(rules.preamble());
		System.out.println(rules.parlimentary());
		System.out.println(rules.republic());
		System.out.println(rules.fundamentalRights());
		
		Citizen citizen = new Citizen();
		
		System.out.println(citizen.written());
		System.out.println(citizen.preamble());
		System.out.println(citizen.parlimentary());
		System.out.println(citizen.republic());
		System.out.println(citizen.fundamentalRights());

	}

	@Override
	public String written() {
		System.out.println("Running written method..");
		return null;
	}

	@Override
	public boolean preamble() {
		System.out.println("Running preamble method..");
		return false;
	}

	@Override
	public int parlimentary() {
		System.out.println("Running parlimentary method..");
		return 0;
	}

	@Override
	public boolean republic() {
		System.out.println("Running republic method..");
		return false;
	}

	@Override
	public int fundamentalRights() {
		System.out.println("Running fundamentalRights method..");
		return 0;
	}

}
