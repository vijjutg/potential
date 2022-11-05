package com.xworkz.boot;

import com.xworkz.encapsulation.Apps;
import com.xworkz.encapsulation.Mobile;

public class MobileRunner {

	public static void main(String[] args) {

		Apps app = new Apps();

		app.display();

		Mobile mobile = new Mobile();

		mobile.setBrand("Samsung");

		mobile.setVersion(1.8);

		System.out.println(mobile.getBrand());

		System.out.println(mobile.getVersion());

		System.out.println(mobile.color);

		System.out.println(mobile.lenthOfDisplay);

		System.out.println(mobile.modelName);

		System.out.println(mobile.price);

	}

}
