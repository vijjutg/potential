package com.xworkz.boot;

import com.xworkz.methods.God;

public class GodRunner {

	public static void main(String[] args) {
		
		God god = new God();
		
		god.setName("Ganesha");
		god.setCountry("India");
		god.setGender("Male");
		god.setFatherName("Shiva");
		god.setPowerfull(true);
		
		God god1 = new God("Ganesha", "India", "Male", true, "Shiva");
		
		System.out.println(god.equals(god1));
		
		System.out.println(god.toString());
		System.out.println(god1.toString());

	}

}
