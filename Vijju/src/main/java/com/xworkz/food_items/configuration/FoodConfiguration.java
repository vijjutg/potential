package com.xworkz.food_items.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.food_items")
public class FoodConfiguration {
	
	public FoodConfiguration() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

}
