package com.xworkz.create.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.create.configuration.SpringConfiguration;
import com.xworkz.create.thing.Shop;

public class ShopRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Shop ref = spring.getBean(Shop.class);
		
		System.out.println(ref);

	}

}
