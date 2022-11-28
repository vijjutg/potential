package com.xworkz.follower;

import com.xworkz.bridge.Cricket;

public class CricketPlayers implements Cricket{

	public static void main(String[] args) {
		
		Cricket cricket = new CricketPlayers();
		
		System.out.println(cricket.wickets());
		System.out.println(cricket.teams());
		System.out.println(cricket.players());
		System.out.println(cricket.umpires());
		System.out.println(cricket.runRate());
		
		CricketPlayers cricketPlayers = new CricketPlayers();
		
		System.out.println(cricketPlayers.wickets());
		System.out.println(cricketPlayers.teams());
		System.out.println(cricketPlayers.players());
		System.out.println(cricketPlayers.umpires());
		System.out.println(cricketPlayers.runRate());

	}

	@Override
	public int wickets() {
		System.out.println("Running wickets method..");
		return 0;
	}

	@Override
	public boolean teams() {
		System.out.println("Running teams method..");
		return false;
	}

	@Override
	public int players() {
		System.out.println("Running players method..");
		return 0;
	}

	@Override
	public String umpires() {
		System.out.println("Running umpires method..");
		return null;
	}

	@Override
	public double runRate() {
		System.out.println("Running runRate method..");
		return 0;
	}

}
