package com.xworkz.encapsulation;

public class Actors {

	Movie movie = new Movie();

	String theatre = movie.theatreName;

	String hero = movie.heroName;

	String heroin = movie.herionName;

	double stras = movie.ratings;

	public void display() {
		System.out.println(theatre);
		System.out.println(hero);
		System.out.println(heroin);
		System.out.println(stras);
	}

}
