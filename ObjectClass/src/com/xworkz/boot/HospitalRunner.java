package com.xworkz.boot;

import com.xworkz.methods.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		hospital.setName("Priya");
		hospital.setPlace("Bangalore");
		hospital.setNoOfStaff(15);
		hospital.setAvgPatients(45);
		hospital.setNoOfFloors(4);
		hospital.setCure(true);
		hospital.setFacility(true);
		
		Hospital hospital1 = new Hospital("Priya", "Bangalore", 15, 45, 4, true, true);
		
		System.out.println(hospital.equals(hospital1));
		
		System.out.println(hospital.toString());
		System.out.println(hospital1.toString());

	}

}
