package com.xworkz.follower;

import com.xworkz.bridge.Bank;

public class Customers implements Bank{

	public static void main(String[] args) {
		
		Bank bank = new Customers();
		
		System.out.println(bank.borrowingLimit());
		System.out.println(bank.interestRunningBalance());
		System.out.println(bank.minimumCommitmentCharge());
		System.out.println(bank.security());
		System.out.println(bank.validityOfCredit());
		
		Customers customer = new Customers();
		
		System.out.println(customer.borrowingLimit());
		System.out.println(customer.interestRunningBalance());
		System.out.println(customer.minimumCommitmentCharge());
		System.out.println(customer.security());
		System.out.println(customer.validityOfCredit());

	}

	@Override
	public double borrowingLimit() {
		System.out.println("Running borrowingLimit method..");
		return 0;
	}

	@Override
	public double interestRunningBalance() {
		System.out.println("Running interestRunningBalance method..");
		return 0;
	}

	@Override
	public int minimumCommitmentCharge() {
		System.out.println("Running minimumCommitmentCharge method..");
		return 0;
	}

	@Override
	public boolean security() {
		System.out.println("Running security method..");
		return false;
	}

	@Override
	public String validityOfCredit() {
		System.out.println("Running validityOfCredit method..");
		return null;
	}

}
