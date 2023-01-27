package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class SweetRunner {

	public static void main(String[] args) {
		
		Collection sweetCollection = new ArrayList();
		
		String sweet1 = "Shahi Tukda";
		String sweet2 = "Kalakand";
		String sweet3 = "Kaju Katli";
		String sweet4 = "Gulab Jamun";
		String sweet5 = "Balushahi";
		String sweet6 = "Mysore pak";
		String sweet7 = "Laddu";
		String sweet8 = "Holige";
		String sweet9 = "Paysa";
		String sweet10 = "Chocalate";
		String sweet11= "Jalebi";
		String sweet12= "Basundi";
		String sweet13= "Cake";
		
		sweetCollection.add(sweet1);
		sweetCollection.add(sweet2);
		sweetCollection.add(sweet3);
		sweetCollection.add(sweet4);
		sweetCollection.add(sweet5);
		sweetCollection.add(sweet6);
		sweetCollection.add(sweet7);
		sweetCollection.add(sweet8);
		sweetCollection.add(sweet9);
		sweetCollection.add(sweet10);
		sweetCollection.add(sweet11);
		sweetCollection.add(sweet12);
		sweetCollection.add(sweet13);
		
		System.out.println(sweetCollection.size());
		
		sweetCollection.clear();
		
		System.out.println("After clearing..");
		
		System.out.println(sweetCollection.size());
	}			
}
