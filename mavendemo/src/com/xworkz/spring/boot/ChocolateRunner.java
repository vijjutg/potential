package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		Chocolate ref = spring.getBean(Chocolate.class);

		System.out.println(ref);

	}

}
