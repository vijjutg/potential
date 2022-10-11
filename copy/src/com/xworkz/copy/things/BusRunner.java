package com.xworkz.copy.boot;

import com.xworkz.copy.Bus;

public class BusRunner {

	public static void main(String[] args) {
		
		Bus ref = new Bus();
		
		ref.busNo = 57;
		ref.start = "Kudligi";
		ref.destination = "Hosapete";
		
		System.out.println("Bus number is : "+ ref.busNo);
		System.out.println("Bus start point is : "+ ref.start);
		System.out.println("Bus destination is : "+ ref.destination);
	}

}
