package com.xworkz.copy.boot;

import com.xworkz.copy.Tea;

public class TeaRunner {

	public static void main(String[] args) {
		
		Tea tea = new Tea();
		
		tea.name = "Kannan Devan";
		tea.price = 50;
		tea.quantity = 8;
		tea.manDate = 27;
		tea.manMonth = 10;
		tea.expDate = 8;
		tea.expMonth = 5;
		tea.expYear = 2024;
		tea.ownerName = "Mathew Abraham";
		
		System.out.println("The name of tea is : "+ tea.name);
		System.out.println("The brand of tea is : "+ tea.brand);
		System.out.println("The ingredient of tea is : "+ tea.ingredient);
		System.out.println("The price of tea is : "+ tea.price);
		System.out.println("The weight of tea is : "+ tea.weight);
		System.out.println("The quantity of tea is : "+ tea.quantity);
		System.out.println("The manufacture date of tea is : "+ tea.manDate);
		System.out.println("The manufacture month of tea is : "+ tea.manMonth);
		System.out.println("The manufacture year of tea is : "+ tea.manYear);
		System.out.println("The expiry date of tea is : "+ tea.expDate);
		System.out.println("The expiry month of tea is : "+ tea.expMonth);
		System.out.println("The expire year of tea is : "+ tea.expYear);
		System.out.println("The tea is tasty : "+ tea.isTasty);
		System.out.println("The owner name of tea is : "+ tea.ownerName);
		System.out.println("The no of peaple who likes tea is : "+ tea.noOfTeaLovers);
		System.out.println("The no of peaple who dont likes tea is : "+ tea.noOfTeaHaters);
		System.out.println("The product code of tea is : "+ tea.productCode);
		System.out.println("The manufacturing country of tea is : "+ tea.manCountry);

	}

}


