package com.xworkz.copy.boot;

import com.xworkz.copy.RMD;

public class RMDRunner {

	public static void main(String[] args) {
		RMD rmd = new RMD();
		
		rmd.brand ="Dhariwal";
		rmd.ingredient = "Betal nuts";
		rmd.price = 1400;
		rmd.quantity = 27;
		rmd.manDate = 10;
		rmd.manMonth = 6;
		rmd.expDate = 8;
		rmd.expMonth = 5;
		rmd.ownerName = "Rasik Manikchand Dhariwal";
		
		System.out.println("The rmd is cause cancer: "+ rmd.causeCancer);
		System.out.println("The brand of rmd is : "+ rmd.brand);
		System.out.println("The ingredient of rmd is : "+ rmd.ingredient);
		System.out.println("The price of rmd is : "+ rmd.price);
		System.out.println("The weight of rmd is : "+ rmd.weight);
		System.out.println("The quantity of rmd is : "+ rmd.quantity);
		System.out.println("The manufacture date of rmd is : "+ rmd.manDate);
		System.out.println("The manufacture month of rmd is : "+ rmd.manMonth);
		System.out.println("The manufacture year of rmd is : "+ rmd.manYear);
		System.out.println("The expiry date of rmd is : "+ rmd.expDate);
		System.out.println("The expiry month of rmd is : "+ rmd.expMonth);
		System.out.println("The expire year of rmd is : "+ rmd.expYear);
		System.out.println("The rmd is safe : "+ rmd.isSafe);
		System.out.println("The owner name of rmd is : "+ rmd.ownerName);
		System.out.println("The no of peaple who likes rmd is : "+ rmd.noOfRMDLikers);
		System.out.println("The no of peaple who dont likes rmd is : "+ rmd.noOfRMDHaters);
		System.out.println("The product code of rmd is : "+ rmd.productCode);
		System.out.println("The manufacturing country of rmd is : "+ rmd.manCountry);

		

	}

}
