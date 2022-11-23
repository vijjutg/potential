package com.xworkz.boot;

import com.xworkz.methods.Currency;

public class CurrencyRunner {

	public static void main(String[] args) {
		
		Currency currency = new Currency();
		
		currency.setCountry("India");
		currency.setRunning(true);
		currency.setColor("pink");
		currency.setLanguage("Hindi");
		
		Currency currency1 = new Currency("India", true, "pink", "Hindi");
		
		boolean compare = currency.equals(currency1);
		System.out.println(compare);
		
		System.out.println(currency.toString());
		System.out.println(currency1.toString());
	}
}
