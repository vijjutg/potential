package com.xworkz.copy.boot;

import com.xworkz.copy.Cigarette;

public class CigaretteRunner {

	public static void main(String[] args) {
		
		Cigarette cigarette = new Cigarette();
		
		cigarette.name = "Bristol";
		cigarette.price = 35;
		cigarette.quantity = 8;
		cigarette.manDate = 27;
		cigarette.manMonth = 10;
		cigarette.expDate = 8;
		cigarette.expMonth = 5;
		cigarette.brand ="Gold";
		cigarette.ownerName = "H O Wills";
		
		System.out.println("The name of cigarette is : "+ cigarette.name);
		System.out.println("The brand of cigarette is : "+ cigarette.brand);
		System.out.println("The ingredient of cigarette is : "+ cigarette.ingredient);
		System.out.println("The price of cigarette is : "+ cigarette.price);
		System.out.println("The weight of cigarette is : "+ cigarette.weight);
		System.out.println("The quantity of cigarette is : "+ cigarette.quantity);
		System.out.println("The manufacture date of cigarette is : "+ cigarette.manDate);
		System.out.println("The manufacture month of cigarette is : "+ cigarette.manMonth);
		System.out.println("The manufacture year of cigarette is : "+ cigarette.manYear);
		System.out.println("The expiry date of cigarette is : "+ cigarette.expDate);
		System.out.println("The expiry month of cigarette is : "+ cigarette.expMonth);
		System.out.println("The expire year of cigarette is : "+ cigarette.expYear);
		System.out.println("The cigarette is safe : "+ cigarette.isSafe);
		System.out.println("The owner name of cigarette is : "+ cigarette.ownerName);
		System.out.println("The no of peaple who likes cigarette is : "+ cigarette.noOfCigaretteLikers);
		System.out.println("The no of peaple who dont likes cigarette is : "+ cigarette.noOfcigaretteHaters);
		System.out.println("The product code of cigarette is : "+ cigarette.productCode);
		System.out.println("The manufacturing country of cigarette is : "+ cigarette.manCountry);


	}

}
