package com.xworkz.boot;

import com.xworkz.abstraction.Atm;
import com.xworkz.subclass.SbiAtm;

public class AtmRunner {

	public static void main(String[] args) {
		
		Atm atm = new SbiAtm();
		atm.checkBalance();
		atm.withdrwa();

	}

}
