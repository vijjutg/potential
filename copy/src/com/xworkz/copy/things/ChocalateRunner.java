package com.xworkz.copy.boot;

import com.xworkz.copy.Chocalate;

public class ChocalateRunner {

	public static void main(String[] args) {
		
		Chocalate ref = new Chocalate();
		ref.name = "Dairy milk";
		ref.brand = "Cadbery";
		ref.price = 45;
		ref.flavour = "Fruit and nut";
		System.out.println("Chocalate name is : "+ ref.name);
		System.out.println("Chocalate brand is : "+ ref.brand);
		System.out.println("Chocalate price is : "+ ref.price);
		System.out.println("Chocalate flavour is : "+ ref.flavour);

	}

}
