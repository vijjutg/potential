package com.xworkz.create.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.create.configuration.SpringConfiguration;
import com.xworkz.create.thing.Tree;

public class TreeRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Tree ref = spring.getBean(Tree.class);
		
		System.out.println(ref);

	}

}
