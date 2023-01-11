package com.xworkz.autowire.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	
	@Autowired
	@Qualifier("rubberName")
	private String name;
	
	@Autowired
	@Qualifier("rubberType")
	private String type;
	
	@Autowired
	@Qualifier("rubberprice")
	private double price;
	
	@Autowired
	@Qualifier("rubberColor")
	private String color;
	
	@Autowired
	@Qualifier("shape")
	private String shape;
	
	@Autowired
	@Qualifier("size")
	private char size;

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", size=" + size + "]";
	}

}
