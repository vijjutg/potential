package com.xworkz.follower;

import com.xworkz.bridge.Company;

public class Workers implements Company{

	public static void main(String[] args) {
		
		Company company = new Workers();
		
		System.out.println(company.safety());
		System.out.println(company.opportunity());
		System.out.println(company.policy());
		System.out.println(company.leavePlane());
		System.out.println(company.discipline());
		
		Workers worker = new Workers();
		
		System.out.println(worker.safety());
		System.out.println(worker.opportunity());
		System.out.println(worker.policy());
		System.out.println(worker.leavePlane());
		System.out.println(worker.discipline());


	}

	@Override
	public boolean safety() {
		System.out.println("Running safety method..");
		return true;
	}

	@Override
	public String opportunity() {
		System.out.println("Running opportunity method..");
		return "plenty";
	}

	@Override
	public String policy() {
		System.out.println("Running policy method..");
		return "provided";
	}

	@Override
	public int leavePlane() {
		System.out.println("Running leavePlane method..");
		return 15;
	}

	@Override
	public boolean discipline() {
		System.out.println("Running discipline method..");
		return true;
	}

}
