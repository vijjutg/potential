package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.custom.Court;
import com.xworkz.inheritance.subclass.*;

public class CourtRunner {

	public static void main(String[] args) {
		
		Court court = new Court();
		
		System.out.println(court.judgeName);
		System.out.println(court.location);
		
		Court court0 = new DistrictCourt();
		
		DistrictCourt district= (DistrictCourt) court0;
		
		System.out.println(district.districtName);
		System.out.println(district.pincode);
		
		Court court1 = new HighCourt();
		
		HighCourt high = (HighCourt) court1;
		
		System.out.println(high.state);
		System.out.println(high.noOfStaffs);
		
		Court court2 = new SupremeCourt();
		
		SupremeCourt supreme = (SupremeCourt)court2;
		
		System.out.println(supreme.finalDecision);
		System.out.println(supreme.nation);

	}

}
