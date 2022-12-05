package com.xworkz.task.abstrctclass;

import com.xworkz.task.bridge.XworkzRule;

public abstract class JavaTrainee extends Person implements XworkzRule{

	public JavaTrainee(String name, String place, int age, String gender, double height) {
		super(name, place, age, gender, height);
	}
	
	abstract int training();
	
	abstract boolean executeProgram();

	@Override
	public boolean uploadTask() {
		System.out.println("Running upload task ...");
		return false;
	}

	@Override
	public boolean completeProgram() {
		System.out.println("Running complete program ...");
		return false;
	}

	@Override
	public boolean eat() {
		System.out.println("Running eat ...");
		return false;
	}

	@Override
	public double sleep() {
		System.out.println("Running sleep ...");
		return 0;
	}

}
