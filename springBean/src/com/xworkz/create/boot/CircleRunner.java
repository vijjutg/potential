package com.xworkz.create.boot;

import com.xworkz.create.configuration.ArraySizeExceededException;
import com.xworkz.create.thing.Circle;

public class CircleRunner {
	
	public static void main(String[] args)  {
	
	Circle ref = new Circle();
	try {
	 ref.method1();
	 ref.method2();
	}
	catch (ArraySizeExceededException e) {
		System.out.println("Running Catch block..");
	}

	}
}
