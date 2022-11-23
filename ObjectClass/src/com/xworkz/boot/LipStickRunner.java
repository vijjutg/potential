package com.xworkz.boot;

import com.xworkz.methods.LipStick;

public class LipStickRunner {

	public static void main(String[] args) {
		
		LipStick lipstick = new LipStick();
		
		lipstick.setBrand("Loreal");
		lipstick.setPrice(300);
		lipstick.setQuantity(5);
		lipstick.setManDate(26);
		lipstick.setProductCode("hsh938r3");
		lipstick.setNetWeight(250);
		lipstick.setQuality(true);
		lipstick.setColor("Red");
		
		LipStick lipstick1 = new LipStick("Loreal", 300, 5, 26, "hsh938r3", 250, true, "Red");
		
		System.out.println(lipstick.equals(lipstick1));
		
		System.out.println(lipstick.toString());
		System.out.println(lipstick1.toString());

	}

}
