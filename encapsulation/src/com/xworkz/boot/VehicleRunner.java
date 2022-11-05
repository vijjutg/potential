package com.xworkz.boot;

import com.xworkz.encapsulation.ShowRoom;
import com.xworkz.encapsulation.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {

		ShowRoom show = new ShowRoom();

		show.display();

		Vehicle vehicle1 = new Vehicle();

		vehicle1.setChargingStation(true);

		vehicle1.setInvestment(108202898);

		vehicle1.bikeBrand = "Honda";

		vehicle1.carBrand = "Lamborgini";

		vehicle1.location = "Bangalore";

		vehicle1.selfDrivingcar = false;

		System.out.println(vehicle1.bikeBrand);

		System.out.println(vehicle1.carBrand);

		System.out.println(vehicle1.location);

		System.out.println(vehicle1.selfDrivingcar);

	}

}
