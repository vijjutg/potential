package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.PhotoShoot;

public class PreWeddingShoot extends PhotoShoot{

	public PreWeddingShoot(String location, double cost, int members) {
		super(location, cost, members);
	}
	
	PhotoShoot photo = new PreWeddingShoot("Madikeri",15000,20);

}
