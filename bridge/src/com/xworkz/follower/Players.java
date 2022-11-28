package com.xworkz.follower;

import com.xworkz.bridge.Game;

public class Players implements Game{

	public static void main(String[] args) {
		
		Game game = new Players();
		
		System.out.println(game.components());
		System.out.println(game.objectOfGame());
		System.out.println(game.setUp());
		System.out.println(game.gamePlay());
		System.out.println(game.end());
		
		Players play = new Players();
		
		System.out.println(play.components());
		System.out.println(play.objectOfGame());
		System.out.println(play.setUp());
		System.out.println(play.gamePlay());
		System.out.println(play.end());

	}

	@Override
	public int components() {
		System.out.println("Running components method..");
		return 0;
	}

	@Override
	public String objectOfGame() {
		System.out.println("Running objectOfGame method..");
		return null;
	}

	@Override
	public double setUp() {
		System.out.println("Running setUp method..");
		return 0;
	}

	@Override
	public char gamePlay() {
		System.out.println("Running gamePlay method..");
		return 0;
	}

	@Override
	public boolean end() {
		System.out.println("Running end method..");
		return false;
	}

}
