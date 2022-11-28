package com.xworkz.follower;

import com.xworkz.bridge.Grammer;

public class Writters implements Grammer{

	public static void main(String[] args) {
		
		Grammer grammer = new Writters();
		
		System.out.println(grammer.wordOrder());
		System.out.println(grammer.punctuation());
		System.out.println(grammer.tense());
		System.out.println(grammer.determiners());
		System.out.println(grammer.connectors());
		
		Writters write = new Writters();
		
		System.out.println(write.wordOrder());
		System.out.println(write.punctuation());
		System.out.println(write.tense());
		System.out.println(write.determiners());
		System.out.println(write.connectors());

	}

	@Override
	public boolean wordOrder() {
		System.out.println("Running wordOrder method..");
		return false;
	}

	@Override
	public String punctuation() {
		System.out.println("Running punctuation method..");
		return null;
	}

	@Override
	public String tense() {
		System.out.println("Running tense method..");
		return null;
	}

	@Override
	public int determiners() {
		System.out.println("Running determiners method..");
		return 0;
	}

	@Override
	public char connectors() {
		System.out.println("Running connectors method..");
		return 0;
	}

}
