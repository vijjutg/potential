package com.xworkz.follower;

import com.xworkz.bridge.DrivingRules;

public class Drivers implements DrivingRules{

	public static void main(String[] args) {
		
		DrivingRules drivingRules = new Drivers();
		
		System.out.println(drivingRules.seatBelt());
		System.out.println(drivingRules.avoidDistraction());
		System.out.println(drivingRules.sppedLimit());
		System.out.println(drivingRules.service());
		System.out.println(drivingRules.trafficSignal());
		
		Drivers drivers = new Drivers();
		
		System.out.println(drivers.seatBelt());
		System.out.println(drivers.avoidDistraction());
		System.out.println(drivers.sppedLimit());
		System.out.println(drivers.service());
		System.out.println(drivers.trafficSignal());

	}

	@Override
	public boolean seatBelt() {
		System.out.println("Running seatBelt method..");
		return false;
	}

	@Override
	public char avoidDistraction() {
		System.out.println("Running avoidDistraction method..");
		return 0;
	}

	@Override
	public double sppedLimit() {
		System.out.println("Running sppedLimit method..");
		return 0;
	}

	@Override
	public String service() {
		System.out.println("Running service method..");
		return null;
	}

	@Override
	public int trafficSignal() {
		System.out.println("Running trafficSignal method..");
		return 0;
	}

}
