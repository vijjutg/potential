package com.xworkz.dtoconfig.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages =  "com.xworkz.dtoconfig")
public class FirstAidConfiguration {

	public FirstAidConfiguration() {
		System.out.println("Defalt const of FirstAidConfiguration...");
	}
	
	@Bean
	public Validator validator() {
		System.out.println("Registering validator...");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory(); 
		Validator validator = factory.getValidator();
		return validator;
	}
}
