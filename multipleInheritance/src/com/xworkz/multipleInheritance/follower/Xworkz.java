package com.xworkz.multipleInheritance.follower;

import com.xworkz.multipleInheritance.subclass.DevelopmentInstitute;
import com.xworkz.multipleInheritance.subclass.TestingInstitute;

public class Xworkz implements DevelopmentInstitute, TestingInstitute {

	@Override
	public int training() {
		System.out.println("Running training method.......");
		return 0;
	}

	@Override
	public boolean placements() {
		System.out.println("Running placements method.....");
		return false;
	}

	@Override
	public boolean interviews() {
		System.out.println("Running interviews method.....");
		return false;
	}

}
