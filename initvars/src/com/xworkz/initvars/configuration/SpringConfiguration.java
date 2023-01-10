package com.xworkz.initvars.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.initvars.beans.Actor;
import com.xworkz.initvars.beans.Rocket;
import com.xworkz.initvars.beans.Season;

@Configuration
@ComponentScan("com.xworkz.initvars")
public class SpringConfiguration {

	@Bean
	public Rocket satellite() {
		System.out.println("Created satellite using spring...");
		Rocket ref = new Rocket();
		return ref;
	}

	@Bean
	public Actor hero() {
		System.out.println("Created hero using spring...");
		Actor ref = new Actor("Rakshit Shetti", "Kannada", 34);
		return ref;
	}
	
	@Bean
	public Season wether() {
		System.out.println("Created wether using spring...");
		Season ref = new Season();
		return ref;
	}

}
