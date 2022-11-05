package com.xworkz.encapsulation;

public class Book {

	BookStore book = new BookStore();

	String ownerName = book.ownerName;

	int items = book.noOfItems;

	String mainThing = book.mainItem;

	double cost = book.price;

	long contact = book.phoneNo;

	double length = book.lengthOfBooks;

	public void display() {
		System.out.println(ownerName);
		System.out.println(items);
		System.out.println(mainThing);
		System.out.println(cost);
		System.out.println(contact);
		System.out.println(length);
	}

}
