package com.xworkz.collection;

import java.util.Collection;
import java.util.LinkedList;

public class CurrencyRunner {

	public static void main(String[] args) {
		
		Collection currencyCollection = new LinkedList();
		
		String currency1 = "United States Dollar";
		String currency2 = "Indian Rupee";
		String currency3 = "Euro";
		String currency4 = "Pound sterling";
		String currency5 = "Albanian Lek";
		String currency6 = "East Caribbean Dollar";
		String currency7 = "South African Rand";
		String currency8 = "Mexican Peso";
		String currency9 = "Russian Ruble";
		String currency10 = "Danish Krone";
		String currency11 = "Bermuda Dollar";
		String currency12 = "Central African CFA franc";
		String currency13 = "Singapore Dollar";
		String currency14 = "Malaysian Ringgit";
		String currency15 = "Swedish Krona";
		String currency16 = "Brunei Dollar";
		String currency17 = "Israeli Shekel";
		String currency18 = "Polish Zloty";
		String currency19 = "Philippine peso";
		String currency20 = "Iranian Rial";
		String currency21= "Japanese Yen";
		String currency22= "Hungarian Forint";
		String currency23= "Chinese Yuan";
		String currency24= "Armenian Dram";
		String currency25= "Brazilian Real";
		String currency26= "Icelandic Króna";
		
		currencyCollection.add(currency26);
		currencyCollection.add(currency25);
		currencyCollection.add(currency24);
		currencyCollection.add(currency23);
		currencyCollection.add(currency22);
		currencyCollection.add(currency21);
		currencyCollection.add(currency20);
		currencyCollection.add(currency19);
		currencyCollection.add(currency18);
		currencyCollection.add(currency17);
		currencyCollection.add(currency16);
		currencyCollection.add(currency15);
		currencyCollection.add(currency14);
		currencyCollection.add(currency13);
		currencyCollection.add(currency12);
		currencyCollection.add(currency11);
		currencyCollection.add(currency10);
		currencyCollection.add(currency9);
		currencyCollection.add(currency8);
		currencyCollection.add(currency7);
		currencyCollection.add(currency6);
		currencyCollection.add(currency5);
		currencyCollection.add(currency4);
		currencyCollection.add(currency3);
		currencyCollection.add(currency2);
		currencyCollection.add(currency1);
		
		System.out.println(currencyCollection.size());
		
		currencyCollection.clear();
		
		System.out.println("After clear..");
		
		System.out.println(currencyCollection.size());
	}

}
