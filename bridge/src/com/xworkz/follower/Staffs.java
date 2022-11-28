package com.xworkz.follower;

import com.xworkz.bridge.Management;

public class Staffs implements Management{

	public static void main(String[] args) {
		
		Management manage = new Staffs();
		
		System.out.println(manage.consistent());
		System.out.println(manage.communication());
		System.out.println(manage.setGoals());
		System.out.println(manage.recognize());
		System.out.println(manage.transparent());
		
		Staffs staff = new Staffs();
		
		System.out.println(staff.consistent());
		System.out.println(staff.communication());
		System.out.println(staff.setGoals());
		System.out.println(staff.recognize());
		System.out.println(staff.transparent());
		
	}

	@Override
	public boolean consistent() {
		System.out.println("Running consistent method..");
		return true;
	}

	@Override
	public String communication() {
		System.out.println("Running communication method...");
		return "good";
	}

	@Override
	public int setGoals() {
		System.out.println("Running setGoals method...");
		return 20;
	}

	@Override
	public boolean recognize() {
		System.out.println("Running recognize method...");
		return false;
	}

	@Override
	public long transparent() {
		System.out.println("Running transparent method...");
		return 0;
	}
}
