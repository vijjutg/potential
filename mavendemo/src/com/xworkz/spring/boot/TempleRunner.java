package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Temple;

public class TempleRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		Temple ref = spring.getBean(Temple.class);

		System.out.println(ref);

	}

}
