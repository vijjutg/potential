package com.xworkz.follower;

import com.xworkz.bridge.Loan;

public class LoanSeekers implements Loan {

	public static void main(String[] args) {
		
		Loan loan = new LoanSeekers();
		
		System.out.println(loan.amount());
		System.out.println(loan.creditScore());
		System.out.println(loan.interestRate());
		System.out.println(loan.emi());
		System.out.println(loan.condtions());
		
		LoanSeekers seeker = new LoanSeekers();
		
		System.out.println(seeker.amount());
		System.out.println(seeker.creditScore());
		System.out.println(seeker.interestRate());
		System.out.println(seeker.emi());
		System.out.println(seeker.condtions());

	}

	@Override
	public double amount() {
		System.out.println("Running amount method..");
		return 0;
	}

	@Override
	public int creditScore() {
		System.out.println("Running creditScore method..");
		return 0;
	}

	@Override
	public double interestRate() {
		System.out.println("Running interestRate method..");
		return 0;
	}

	@Override
	public int emi() {
		System.out.println("Running emi method..");
		return 0;
	}

	@Override
	public boolean condtions() {
		System.out.println("Running condtions method..");
		return false;
	}

}
