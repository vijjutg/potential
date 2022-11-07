package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Court;

public class DistrictCourt extends Court{
	
	public String districtName;
	public long pincode;
	
	public DistrictCourt() {
		
		System.out.println("Creating District Court constructor....");
		
	}

}
