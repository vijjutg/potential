package instance.xworkz.boot;

import instance.xworkz.instancemethods.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		
		String[] apps = { "Whats app web", "Notepad++", "Eclipse"};
		
		int[] photos = { 47, 38, 29};
		
		double[] memory = { 29.4, 309.5};
		
		String[] movies = {"RRR", "KGF Chapter-2", "Love Mocktail-2"};
		
		int[] songs = { 37, 19, 39};
		
		Laptop laptop = new Laptop(apps, 67, 20, photos, 15, memory, movies, 8, songs, "Vijayalakshmi T G", 25000.0);
		
		laptop.display();

	}

}
