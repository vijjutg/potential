package com.xworkz.follower;

import com.xworkz.bridge.Java;

public class Programmers implements Java{

	public static void main(String[] args) {
		
		Java java = new Programmers();
		
		System.out.println(java.comments());
		System.out.println(java.formatting());
		System.out.println(java.naming());
		System.out.println(java.methods());
		System.out.println(java.classes());
		
		Programmers program = new Programmers();
		
		System.out.println(program.comments());
		System.out.println(program.formatting());
		System.out.println(program.naming());
		System.out.println(program.methods());
		System.out.println(program.classes());

	}

	@Override
	public int comments() {
		System.out.println("Running comments method..");
		return 20;
	}

	@Override
	public boolean formatting() {
		System.out.println("Running formatting method..");
		return true;
	}

	@Override
	public String naming() {
		System.out.println("Running naming method..");
		return "camel case";
	}

	@Override
	public char methods() {
		System.out.println("Running methods method..");
		return ' ';
	}

	@Override
	public String classes() {
		System.out.println("Running classes method..");
		return null;
	}
}
