package com.xworkz.referclass.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.referclass.configuration.ComponentConfiguration;
import com.xworkz.referclass.interfaces.PetrolBunk;

public class Runner {
	
	public static void main(String[] args) {
	
	ApplicationContext container = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
	
	System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
	System.out.println(container.getBeanDefinitionCount());
	
	PetrolBunk ref = container.getBean(PetrolBunk.class);
	ref.purchase();
	
	}
}
