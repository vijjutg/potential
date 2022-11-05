package com.xworkz.boot;

import com.xworkz.encapsulation.Actors;
import com.xworkz.encapsulation.Movie;

public class MovieRunner {

	public static void main(String[] args) {

		Actors actor = new Actors();
		actor.display();

		Movie movie1 = new Movie();

		movie1.setBudget(25);

		movie1.setMovieName("Kantara");

		System.out.println(movie1.getBudget());

		System.out.println(movie1.getMovieName());

		movie1.noOfSeats = 60;

		movie1.noOfTypes = 3;

		movie1.location = "Bangalore";

		movie1.snacks = true;

		movie1.ticketPrice = 300;

		System.out.println(movie1.location);

		System.out.println(movie1.noOfSeats);

		System.out.println(movie1.noOfTypes);

		System.out.println(movie1.snacks);

		System.out.println(movie1.ticketPrice);

	}

}
