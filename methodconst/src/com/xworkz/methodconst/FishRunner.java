package com.xworkz.boot;

import com.xworkz.methodconst.Fish;

public abstract class FishRunner {

	public static void main(String[] args) {
		
		Fish fish = new Fish();
		System.out.println("The name of the fish is : "+ fish.name);
		System.out.println("The type of the fish is : "+ fish.type);
		System.out.println("The price of the fish is : "+ fish.price);
		System.out.println("The weight of the fish is : "+ fish.weight);
		System.out.println("The length of the fish is : "+ fish.length);
		
		Fish fish1 = new Fish("Anchovy","Small");
		System.out.println("The name of the fish is : "+ fish1.name);
		System.out.println("The type of the fish is : "+ fish1.type);
		System.out.println("The price of the fish is : "+ fish1.price);
		System.out.println("The weight of the fish is : "+ fish1.weight);
		System.out.println("The length of the fish is : "+ fish1.length);
		
		Fish fish2 = new Fish("Bream",250);
		System.out.println("The name of the fish is : "+ fish2.name);
		System.out.println("The type of the fish is : "+ fish2.type);
		System.out.println("The price of the fish is : "+ fish2.price);
		System.out.println("The weight of the fish is : "+ fish2.weight);
		System.out.println("The length of the fish is : "+ fish2.length);
		
		Fish fish3 = new Fish(10,"Big");
		System.out.println("The name of the fish is : "+ fish3.name);
		System.out.println("The type of the fish is : "+ fish3.type);
		System.out.println("The price of the fish is : "+ fish3.price);
		System.out.println("The weight of the fish is : "+ fish3.weight);
		System.out.println("The length of the fish is : "+ fish3.length);
		
		Fish fish4 = new Fish("Climbing perch", "Big", 13);
		System.out.println("The name of the fish is : "+ fish4.name);
		System.out.println("The type of the fish is : "+ fish4.type);
		System.out.println("The price of the fish is : "+ fish4.price);
		System.out.println("The weight of the fish is : "+ fish4.weight);
		System.out.println("The length of the fish is : "+ fish4.length);
		
		Fish fish5 = new Fish(530, 5.7, 9);
		System.out.println("The name of the fish is : "+ fish5.name);
		System.out.println("The type of the fish is : "+ fish5.type);
		System.out.println("The price of the fish is : "+ fish5.price);
		System.out.println("The weight of the fish is : "+ fish5.weight);
		System.out.println("The length of the fish is : "+ fish5.length);
		
		Fish fish6 = new Fish("Medium", 6, 460);
		System.out.println("The name of the fish is : "+ fish6.name);
		System.out.println("The type of the fish is : "+ fish6.type);
		System.out.println("The price of the fish is : "+ fish6.price);
		System.out.println("The weight of the fish is : "+ fish6.weight);
		System.out.println("The length of the fish is : "+ fish6.length);
		
		Fish fish7 = new Fish(300, "Eal", 2.6, "small", 0.7);
		System.out.println("The name of the fish is : "+ fish7.name);
		System.out.println("The type of the fish is : "+ fish7.type);
		System.out.println("The price of the fish is : "+ fish7.price);
		System.out.println("The weight of the fish is : "+ fish7.weight);
		System.out.println("The length of the fish is : "+ fish7.length);
		
	}

}
