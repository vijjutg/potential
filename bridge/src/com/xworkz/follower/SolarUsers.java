package com.xworkz.follower;

import com.xworkz.bridge.Solar;

public class SolarUsers implements Solar{

	public static void main(String[] args) {
		
		Solar solar = new SolarUsers();
		
		System.out.println(solar.enery());
		System.out.println(solar.incentives());
		System.out.println(solar.installation());
		System.out.println(solar.panels());
		System.out.println(solar.savings());
		
		SolarUsers solarUsers = new SolarUsers();
		
		System.out.println(solarUsers.enery());
		System.out.println(solarUsers.incentives());
		System.out.println(solarUsers.installation());
		System.out.println(solarUsers.panels());
		System.out.println(solarUsers.savings());

	}

	@Override
	public String enery() {
		System.out.println("Running enery method..");
		return null;
	}

	@Override
	public int incentives() {
		System.out.println("Running incentives method..");
		return 0;
	}

	@Override
	public boolean installation() {
		System.out.println("Running installation method..");
		return false;
	}

	@Override
	public int panels() {
		System.out.println("Running panels method..");
		return 0;
	}

	@Override
	public double savings() {
		System.out.println("Running savings method..");
		return 0;
	}

}
