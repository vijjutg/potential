package com.xworkz.autowire.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Apps {
	
	@Autowired
	@Qualifier("time")
	private short downloadTime;
	
	@Autowired
	@Qualifier("number")
	private byte serialNo;
	
	@Autowired
	@Qualifier("numOfUsers")
	private int noOfUser;
	
	@Autowired
	@Qualifier("idNum")
	private long idNumber;
	
	@Autowired
	@Qualifier("sizeOfApp")
	private float appSize;
	
	@Autowired
	@Qualifier("amountOfApp")
	private double price;
	
	@Autowired
	@Qualifier("userFriendly")
	private boolean compatible;
	
	@Autowired
	@Qualifier("rate")
	private char rating;
	
	@Autowired
	@Qualifier("appName")
	private String name;

	@Override
	public String toString() {
		return "Apps [downloadTime=" + downloadTime + ", serialNo=" + serialNo + ", noOfUser=" + noOfUser
				+ ", idNumber=" + idNumber + ", appSize=" + appSize + ", price=" + price + ", compatible=" + compatible
				+ ", rating=" + rating + ", name=" + name + "]";
	}

}
