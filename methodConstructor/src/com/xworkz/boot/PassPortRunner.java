package com.xworkz.boot;

import com.xworkz.methodconst.PassPort;

public class PassPortRunner {

	public static void main(String[] args) {

		PassPort passport = new PassPort();

		System.out.println("The number of the passport : " + passport.number);
		System.out.println("The name of the passport : " + passport.name);
		System.out.println("The expiry date of the passport : " + passport.expDate);
		System.out.println("The country of the passport : " + passport.country);
		System.out.println("The issued date of the passport : " + passport.issuedDate);
		System.out.println("The number of leafes of the passport : " + passport.noOfLeafes);

		PassPort passport1 = new PassPort(7022454703l);

		System.out.println("The number of the passport : " + passport1.number);
		System.out.println("The name of the passport : " + passport1.name);
		System.out.println("The expiry date of the passport : " + passport1.expDate);
		System.out.println("The country of the passport : " + passport1.country);
		System.out.println("The issued date of the passport : " + passport1.issuedDate);
		System.out.println("The number of leafes of the passport : " + passport1.noOfLeafes);

		PassPort passport2 = new PassPort("Vijayalakshmi T G");

		System.out.println("The number of the passport : " + passport2.number);
		System.out.println("The name of the passport : " + passport2.name);
		System.out.println("The expiry date of the passport : " + passport2.expDate);
		System.out.println("The country of the passport : " + passport2.country);
		System.out.println("The issued date of the passport : " + passport2.issuedDate);
		System.out.println("The number of leafes of the passport : " + passport2.noOfLeafes);

		PassPort passport3 = new PassPort(14);

		System.out.println("The number of the passport : " + passport3.number);
		System.out.println("The name of the passport : " + passport3.name);
		System.out.println("The expiry date of the passport : " + passport3.expDate);
		System.out.println("The country of the passport : " + passport3.country);
		System.out.println("The issued date of the passport : " + passport3.issuedDate);
		System.out.println("The number of leafes of the passport : " + passport3.noOfLeafes);

		PassPort passport4 = new PassPort("India", 27);

		System.out.println("The number of the passport : " + passport4.number);
		System.out.println("The name of the passport : " + passport4.name);
		System.out.println("The expiry date of the passport : " + passport4.expDate);
		System.out.println("The country of the passport : " + passport4.country);
		System.out.println("The issued date of the passport : " + passport4.issuedDate);
		System.out.println("The number of leafes of the passport : " + passport4.noOfLeafes);

		PassPort passport5 = new PassPort(7022454703l, "Vijayalakshmi T G");

		System.out.println("The number of the passport : " + passport5.number);
		System.out.println("The name of the passport : " + passport5.name);
		System.out.println("The expiry date of the passport : " + passport5.expDate);
		System.out.println("The country of the passport : " + passport5.country);
		System.out.println("The issued date of the passport : " + passport5.issuedDate);
		System.out.println("The number of leafes of the passport : " + passport5.noOfLeafes);

		PassPort passport6 = new PassPort(7, 7022454703l);

		System.out.println("The number of the passport : " + passport6.number);
		System.out.println("The name of the passport : " + passport6.name);
		System.out.println("The expiry date of the passport : " + passport6.expDate);
		System.out.println("The country of the passport : " + passport6.country);
		System.out.println("The issued date of the passport : " + passport6.issuedDate);
		System.out.println("The number of leafes of the passport : " + passport6.noOfLeafes);

		PassPort passport7 = new PassPort("India", 27, 7022454703l);

		System.out.println("The number of the passport : " + passport7.number);
		System.out.println("The name of the passport : " + passport7.name);
		System.out.println("The expiry date of the passport : " + passport7.expDate);
		System.out.println("The country of the passport : " + passport7.country);
		System.out.println("The issued date of the passport : " + passport7.issuedDate);
		System.out.println("The number of leafes of the passport : " + passport7.noOfLeafes);

	}

}
