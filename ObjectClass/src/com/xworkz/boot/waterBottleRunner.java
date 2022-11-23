package com.xworkz.boot;

import com.xworkz.methods.waterBottle;

public class waterBottleRunner {

	public static void main(String[] args) {
		
		waterBottle bottle = new waterBottle();
		
		bottle.setColor("pink");
		bottle.setShape("round");
		bottle.setPortable(true);
		
		waterBottle bottle1 = new waterBottle("Blue", "round", true);
		
		boolean compare = bottle.equals(bottle1);
		System.out.println(compare);
		
		System.out.println(bottle.toString());
		System.out.println(bottle1.toString());

	}

}
