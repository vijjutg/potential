package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Mask;

public class MaskRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		Mask ref = spring.getBean(Mask.class);

		System.out.println(ref);

	}

}
