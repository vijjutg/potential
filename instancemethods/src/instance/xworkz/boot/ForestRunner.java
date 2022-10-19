package instance.xworkz.boot;

import instance.xworkz.instancemethods.Forest;

public class ForestRunner {

	public static void main(String[] args) {

		String[] animals = { "jaguars", "harpy eagles", "pink river dolphins" };

		String[] bird = { "Parrot", "Ostrich", "Peacock" };

		String[] vegs = { "Deer", "Rabbit" };

		String[] nonVegs = { "Lion", "Lipord", "Fox" };

		String[] underWater = { "Fish", "Crocadile" };
		
		int[] num = {918,927,198};

		Forest forest = new Forest("Amazon", 9785.8, "Moist tropical forest", "Northwestern Brazil", 7647, animals,
				bird, vegs, nonVegs, underWater, num);

		forest.display();

	}

}
