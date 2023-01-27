package com.xworkz.create.thing;

import com.xworkz.create.configuration.ArraySizeExceededException;

public class Circle {

	public void method1() throws ArraySizeExceededException {
		System.out.println("Running method 1");
       method2();
	}

	public void method2() throws ArraySizeExceededException {
		System.out.println("Running method 2");
		throw new ArraySizeExceededException();
	}

}
