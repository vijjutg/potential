package com.xworkz.boot;

import com.xworkz.encapsulation.God;
import com.xworkz.encapsulation.Temple;

public class TempleRunner {

	public static void main(String[] args) {
		
		God god = new God();
		
		god.display();
		
		Temple temple = new Temple();
		
		temple.setAmount(86979);
		
		temple.setConstructor("Devotees");
		
		System.out.println(temple.getAmount());
		
		System.out.println(temple.getConstructor());
		
		System.out.println(temple.area);
		
		System.out.println(temple.heigth);
		
		System.out.println(temple.old);

	}

}
