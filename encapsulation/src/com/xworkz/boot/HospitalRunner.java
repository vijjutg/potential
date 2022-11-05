package com.xworkz.boot;

import com.xworkz.encapsulation.Hospital;
import com.xworkz.encapsulation.Medicine;

public class HospitalRunner {

	public static void main(String[] args) {

		Medicine medicine = new Medicine();

		medicine.display();

		Hospital hospital = new Hospital();

		hospital.setName("Suguna");

		hospital.setNoOfStaff(15);

		System.out.println(hospital.getName());

		System.out.println(hospital.getNoOfStaff());

		hospital.foodAvailable = true;

		hospital.noOfFloors = 2;

		hospital.treatmentType = "Eye treatment";

		System.out.println(hospital.foodAvailable);

		System.out.println(hospital.noOfFloors);

		System.out.println(hospital.treatmentType);

	}

}
