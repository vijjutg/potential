package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.custom.Doctor;
import com.xworkz.inheritance.subclass.*;

public class DoctorRunner {

	public static void main(String[] args) {
		
		Doctor doctor = new Doctor();
		
		System.out.println(doctor.hospitaName);
		System.out.println(doctor.name);
		
		Doctor doctor1 = new Dentist();
		
		Dentist dentist = (Dentist)doctor1;
		
		System.out.println(dentist.consultDay);
		System.out.println(dentist.specialist);
		
		Doctor doctor2 = new ENT();
		
		ENT ent = (ENT)doctor2;
		
		System.out.println(ent.expansion);
		System.out.println(ent.fees);
		
		Doctor doctor3 = new Cardiologist();
		
		Cardiologist cardiac = (Cardiologist)doctor3;
		
		System.out.println(cardiac.heartTransplant);
		System.out.println(cardiac.noOfPatients);

	}

}
