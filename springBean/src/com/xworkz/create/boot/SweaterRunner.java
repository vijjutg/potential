package com.xworkz.create.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.create.configuration.SpringConfiguration;
import com.xworkz.create.thing.Sweater;

public class SweaterRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Sweater ref = spring.getBean(Sweater.class);
		
		System.out.println(ref);

	}

}
