package com.xworkz.create.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.create.configuration.SpringConfiguration;
import com.xworkz.create.thing.Temple;

public class TempleRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Temple ref = spring.getBean(Temple.class);
		
		System.out.println(ref);

	}

}
