package com.xworkz.boot;

import com.xworkz.methods.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {
		
		Institution institute = new Institution();
		
		institute.setName("X-workz");
		institute.setPlace("Rajajinagara");
		institute.setNoOfClass(3);
		institute.setNoOfLectures(5);
		institute.setNoOfStudents(450);
		institute.setGoodCampus(true);
		
		Institution institute1 = new Institution("X-workz", "Rajajinagara", 3, 5, 450, true);
		
		System.out.println(institute.equals(institute1));
		
		System.out.println(institute.toString());
		System.out.println(institute1.toString());
		
	}

}
