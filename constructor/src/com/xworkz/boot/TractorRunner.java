package com.xworkz.boot;

import com.xworkz.constructor.Tractor;

public class TractorRunner {

	public static void main(String[] args) {
		
		Tractor tractor = new Tractor();
		
		System.out.println("The name of the tractor is : "+ tractor.name);
		System.out.println("The brand of the tractor is : "+ tractor.brand);
		System.out.println("The price of the tractor is : "+ tractor.price);
		System.out.println("The color of the tractor is : "+ tractor.color);
		System.out.println("The hp of the tractor is : "+ tractor.hp);
		System.out.println("The model of the tractor is : "+ tractor.model);
		
		Tractor tractor1 = new Tractor("Swaraj");
		System.out.println("The name of the tractor is : "+ tractor1.name);
		System.out.println("The brand of the tractor is : "+ tractor1.brand);
		System.out.println("The price of the tractor is : "+ tractor1.price);
		System.out.println("The color of the tractor is : "+ tractor1.color);
		System.out.println("The hp of the tractor is : "+ tractor1.hp);
		System.out.println("The model of the tractor is : "+ tractor1.model);
		
		Tractor tractor2 = new Tractor("Swaraj", "Mahindra");
		System.out.println("The name of the tractor is : "+ tractor2.name);
		System.out.println("The brand of the tractor is : "+ tractor2.brand);
		System.out.println("The price of the tractor is : "+ tractor2.price);
		System.out.println("The color of the tractor is : "+ tractor2.color);
		System.out.println("The hp of the tractor is : "+ tractor2.hp);
		System.out.println("The model of the tractor is : "+ tractor2.model);
		
		Tractor tractor3 = new Tractor("Swaraj", "Mahindra", 450000);
		System.out.println("The name of the tractor is : "+ tractor3.name);
		System.out.println("The brand of the tractor is : "+ tractor3.brand);
		System.out.println("The price of the tractor is : "+ tractor3.price);
		System.out.println("The color of the tractor is : "+ tractor3.color);
		System.out.println("The hp of the tractor is : "+ tractor3.hp);
		System.out.println("The model of the tractor is : "+ tractor3.model);
		
		Tractor tractor4 = new Tractor("Swaraj", "Mahindra", 450000, "Red");
		System.out.println("The name of the tractor is : "+ tractor4.name);
		System.out.println("The brand of the tractor is : "+ tractor4.brand);
		System.out.println("The price of the tractor is : "+ tractor4.price);
		System.out.println("The color of the tractor is : "+ tractor4.color);
		System.out.println("The hp of the tractor is : "+ tractor4.hp);
		System.out.println("The model of the tractor is : "+ tractor4.model);
		
		Tractor tractor5 = new Tractor("Swaraj", "Mahindra", 450000, "Red", 4.7);
		System.out.println("The name of the tractor is : "+ tractor5.name);
		System.out.println("The brand of the tractor is : "+ tractor5.brand);
		System.out.println("The price of the tractor is : "+ tractor5.price);
		System.out.println("The color of the tractor is : "+ tractor5.color);
		System.out.println("The hp of the tractor is : "+ tractor5.hp);
		System.out.println("The model of the tractor is : "+ tractor5.model);
		
	}

}
