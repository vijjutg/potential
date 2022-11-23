package com.xworkz.boot;

import com.xworkz.methods.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		
		vehicle.setName("Car");
		vehicle.setPrice(2000000);
		
		Vehicle vehicle1 = new Vehicle("Car",2000000);
		
		boolean compare = vehicle.equals(vehicle1);
		System.out.println(compare);
		
		System.out.println(vehicle.toString());
		System.out.println(vehicle1.toString());
	}

}
