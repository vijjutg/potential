package com.xworkz.copy.boot;

import com.xworkz.copy.DistrictCollector;

public class DistrictRunner {

	public static void main(String[] args) {
		
		DistrictCollector ref = new DistrictCollector();
		ref.name = "Prutvi Singh";
		ref.age = 36;
		ref.district = "Vijayanagara";
		ref.batchNo = 67;
		
		System.out.println("District collector name is : "+ref.name );
		System.out.println("District collector age is : "+ref.age );
		System.out.println("District collector district is : "+ref.district );
		System.out.println("District collector batchNo is : "+ref.batchNo );

	}

}
