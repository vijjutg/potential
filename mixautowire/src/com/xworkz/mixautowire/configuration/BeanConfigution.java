package com.xworkz.mixautowire.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mixautowire")
public class BeanConfigution {
	
	@Bean
	public int idNum() {
		System.out.println("Registering id num with spring...");
		return 35;
	}
	
	@Bean
	public String paperName() {
		System.out.println("Registering paperName with spring...");
		return "VijayaVani";
	}
	
	@Bean
	public String ownerName() {
		System.out.println("Registering ownerName with spring...");
		return "Vijay Sankeswar";
	}
	
	@Bean
	public String language() {
		System.out.println("Registering id num with spring...");
		return "Kannada";
	}
	
	@Bean
	public double getPrice() {
		System.out.println("Registering id num with spring...");
		return 8.0;
	}

}
