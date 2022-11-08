package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Dowry;

public class Gold extends Dowry{

	public Gold(String giver, String receiver, boolean catched) {
		super(giver, receiver, catched);
	}
	
	Dowry dowry = new Gold("Goutham","Mahesh",false);

}
