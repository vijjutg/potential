package com.xworkz.follower;

import com.xworkz.bridge.Exam;

public class Students implements Exam{

	public static void main(String[] args) {
		
		Exam exam = new Students();
		
		System.out.println(exam.hallTicket());
		System.out.println(exam.idCard());
		System.out.println(exam.instructions());
		System.out.println(exam.timing());
		System.out.println(exam.allowedMaterials());
		
		Students student = new Students();
		
		System.out.println(student.hallTicket());
		System.out.println(student.idCard());
		System.out.println(student.instructions());
		System.out.println(student.timing());
		System.out.println(student.allowedMaterials());

	}

	@Override
	public boolean hallTicket() {
		System.out.println("Running hallTicket method..");
		return true;
	}

	@Override
	public String idCard() {
		System.out.println("Running idCard method..");
		return "carried";
	}

	@Override
	public int instructions() {
		System.out.println("Running instructions method..");
		return 35;
	}

	@Override
	public double timing() {
		System.out.println("Running timing method..");
		return 10.30;
	}

	@Override
	public boolean allowedMaterials() {
		System.out.println("Running allowedMaterials method..");
		return false;
	}

}
