package com.xworkz.collection;

import java.util.Collection;
import java.util.LinkedHashSet;

public class BikeRunner {

	public static void main(String[] args) {
		
		Collection bikeCollection = new LinkedHashSet();
		
		String bike1 = "TVS";
		String bike2 = "Hero Moto Corp";
		String bike3 = "Honda";
		String bike4 = "BGauss";
		String bike5 = "Bajaj";
		String bike6 = "Royal Enfield";
		String bike7 = "Suzuki";
		String bike8 = "Jawa Motorcycles";
		String bike9 = "Hero Electric";
		String bike10 = "Harley Davidson";
		String bike11 = "Vespa";
		String bike12 = "Ducati";
		String bike13 = "Kawasaki";
		String bike14 = "Ducati";
		String bike15 = "BMW";
		String bike16 = "Stella";
		String bike17 = "Yamaha";
		String bike18 = "KTM";
		
		bikeCollection.add(bike1);
		bikeCollection.add(bike2);
		bikeCollection.add(bike3);
		bikeCollection.add(bike4);
		bikeCollection.add(bike5);
		bikeCollection.add(bike6);
		bikeCollection.add(bike7);
		bikeCollection.add(bike8);
		bikeCollection.add(bike9);
		bikeCollection.add(bike10);
		bikeCollection.add(bike11);
		bikeCollection.add(bike12);
		bikeCollection.add(bike13);
		bikeCollection.add(bike14);
		bikeCollection.add(bike15);
		bikeCollection.add(bike16);
		bikeCollection.add(bike17);
		bikeCollection.add(bike18);
		
		System.out.println(bikeCollection.size());
		
		bikeCollection.clear();
		
		System.out.println("After clearing..");
		
		System.out.println(bikeCollection.size());
        
	}

}
