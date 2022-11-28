package com.xworkz.follower;

import com.xworkz.bridge.Political;

public class Politician implements Political{

	public static void main(String[] args) {
		
		Political political = new Politician();
		
		System.out.println(political.Legitimacy());
		System.out.println(political.separationOfPower());
		System.out.println(political.popularPartition());
		System.out.println(political.periodicElection());
		System.out.println(political.ruleOfLaw());
		
		Politician politician = new Politician();
		
		System.out.println(politician.Legitimacy());
		System.out.println(politician.separationOfPower());
		System.out.println(politician.popularPartition());
		System.out.println(politician.periodicElection());
		System.out.println(politician.ruleOfLaw());

	}

	@Override
	public boolean Legitimacy() {
		System.out.println("Running Legitimacy method..");
		return false;
	}

	@Override
	public int separationOfPower() {
		System.out.println("Running separationOfPower method..");
		return 0;
	}

	@Override
	public char popularPartition() {
		System.out.println("Running popularPartition method..");
		return 0;
	}

	@Override
	public int periodicElection() {
		System.out.println("Running periodicElection method..");
		return 0;
	}

	@Override
	public String ruleOfLaw() {
		System.out.println("Running ruleOfLaw method..");
		return null;
	}

}
