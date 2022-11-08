package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Dj;

public class GaneshaFest extends Dj{

	public GaneshaFest(String setName, double cost, String event) {
		super(setName, cost, event);
		
		Dj dj = new GaneshaFest("GanaBajana",5000,"Ganesha festival");
		
	}

}
