package com.xworkz.light.component;

import org.springframework.stereotype.Component;

@Component
public class Webmvc {
	
	public Webmvc() {
		System.out.println("Created "+ this.getClass().getSimpleName());
	}

}
