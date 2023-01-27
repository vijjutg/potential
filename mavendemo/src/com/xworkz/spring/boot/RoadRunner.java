package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Bus;
import com.xworkz.spring.thing.Road;

public class RoadRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		Road ref = spring.getBean(Road.class);

		System.out.println(ref);

		String str = ref.toString();

		System.out.println(str);

	}

}
