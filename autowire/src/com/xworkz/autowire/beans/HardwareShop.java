package com.xworkz.autowire.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	
	@Autowired
	@Qualifier("num")
	private int id;
	
	@Autowired
	@Qualifier("shopName")
	private String name;
	
	@Autowired
	@Qualifier("gstNum")
	private String gstNo;
	
	@Autowired
	@Qualifier("owner")
	private String ownerName;
	
	@Autowired
	@Qualifier("place")
	private String address;

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

}
