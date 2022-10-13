package com.xworkz.copy.boot;

import com.xworkz.copy.Dustbin;

public class DustbinRunner {

	public static void main(String[] args) {
		
		Dustbin dustbin = new Dustbin();
		
		dustbin.weight = 862.8;
		dustbin.price = 900;
		dustbin.quantity = 7;
		dustbin.height = 76.5;
		dustbin.shape = "Square";
		dustbin.manDate = 27;
		dustbin.manMonth = 10;
		dustbin.manYear =2022l;
		dustbin.isGood = true;
		
		System.out.println("The capacity of the dustbin is : "+ dustbin.capacity);
		System.out.println("The color of the dustbin is : "+ dustbin.color);
		System.out.println("The size of the dustbin is : "+ dustbin.size);
		System.out.println("The weight of the dustbin is : "+ dustbin.weight);
		System.out.println("The company of the dustbin is : "+dustbin.company);
		System.out.println("The price of the dustbin is : "+dustbin.price);
		System.out.println("The quantity of the dustbin is : "+dustbin.quantity);
		System.out.println("The hight of the dustbin is : "+dustbin.height);
		System.out.println("The shape of the dustbin is : "+dustbin.shape);
		System.out.println("The manufacture date of the dustbin is : "+dustbin.manDate);
		System.out.println("The manufacture month of the dustbin is : "+dustbin.manMonth);
		System.out.println("The manufacture year of the dustbin is : "+dustbin.manYear);
		System.out.println("The dustbin is good : "+dustbin.isGood);
		System.out.println("The number people using dustbin is : "+dustbin.noOfPeopleUsing);
		System.out.println("The number of people not using dustbin is : "+dustbin.noOfPeopleNotUsing);
		System.out.println("The dustbin holds is : "+dustbin.holds);
		System.out.println("The type of the dustbin is : "+dustbin.type);
		System.out.println(" is dustbin easy to use : "+dustbin.easy);

	}

}
