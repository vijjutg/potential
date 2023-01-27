package com.xworkz.mixautowire.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {

	@Autowired
	private int id;
	@Autowired
	private String language;

	private String name;
	private String ownerName;
	private double price;
	
	public NewsPaper() {

	}

	public NewsPaper(@Qualifier("VijayaVani") String name,@Qualifier("Vijay Sankeswar") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	@Autowired
	@Qualifier("getPrice")
	public void setPrice(double price) {
		this.price = price;
	}

}
