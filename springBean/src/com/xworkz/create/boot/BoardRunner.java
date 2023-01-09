package com.xworkz.create.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.create.configuration.SpringConfiguration;
import com.xworkz.create.thing.Board;

public class BoardRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Board ref = spring.getBean(Board.class);
		
		System.out.println(ref);

	}

}
