package com.xworkz.boot;

import com.xworkz.methodconst.Bread;

public class BreadRunner {

	public static void main(String[] args) {

		Bread bread = new Bread();

		System.out.println("The type of bread is : " + bread.type);
		System.out.println("The shape of bread is : " + bread.shape);
		System.out.println("The price of bread is : " + bread.price);
		System.out.println("The quantity of bread is : " + bread.quantity);
		System.out.println("The comapayName of bread is : " + bread.companyName);

		Bread bread1 = new Bread("Medium", "Square");

		System.out.println("The type of bread is : " + bread1.type);
		System.out.println("The shape of bread is : " + bread1.shape);
		System.out.println("The price of bread is : " + bread1.price);
		System.out.println("The quantity of bread is : " + bread1.quantity);
		System.out.println("The comapayName of bread is : " + bread1.companyName);

		Bread bread2 = new Bread(50, "Square");

		System.out.println("The type of bread is : " + bread2.type);
		System.out.println("The shape of bread is : " + bread2.shape);
		System.out.println("The price of bread is : " + bread2.price);
		System.out.println("The quantity of bread is : " + bread2.quantity);
		System.out.println("The comapayName of bread is : " + bread2.companyName);

		Bread bread3 = new Bread(8, 50);

		System.out.println("The type of bread is : " + bread3.type);
		System.out.println("The shape of bread is : " + bread3.shape);
		System.out.println("The price of bread is : " + bread3.price);
		System.out.println("The quantity of bread is : " + bread3.quantity);
		System.out.println("The comapayName of bread is : " + bread3.companyName);

		Bread bread4 = new Bread(8, "Square");

		System.out.println("The type of bread is : " + bread4.type);
		System.out.println("The shape of bread is : " + bread4.shape);
		System.out.println("The price of bread is : " + bread4.price);
		System.out.println("The quantity of bread is : " + bread4.quantity);
		System.out.println("The comapayName of bread is : " + bread4.companyName);

		Bread bread5 = new Bread("Square", 8, 50);

		System.out.println("The type of bread is : " + bread5.type);
		System.out.println("The shape of bread is : " + bread5.shape);
		System.out.println("The price of bread is : " + bread5.price);
		System.out.println("The quantity of bread is : " + bread5.quantity);
		System.out.println("The comapayName of bread is : " + bread5.companyName);

		Bread bread6 = new Bread(50, "Britaniya", "Square");

		System.out.println("The type of bread is : " + bread6.type);
		System.out.println("The shape of bread is : " + bread6.shape);
		System.out.println("The price of bread is : " + bread6.price);
		System.out.println("The quantity of bread is : " + bread6.quantity);
		System.out.println("The comapayName of bread is : " + bread6.companyName);

		Bread bread7 = new Bread(50, "Britaniya", "Square", "Medium");

		System.out.println("The type of bread is : " + bread7.type);
		System.out.println("The shape of bread is : " + bread7.shape);
		System.out.println("The price of bread is : " + bread7.price);
		System.out.println("The quantity of bread is : " + bread7.quantity);
		System.out.println("The comapayName of bread is : " + bread7.companyName);

	}

}
