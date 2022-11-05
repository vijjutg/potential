package com.xworkz.boot;

import com.xworkz.encapsulation.Book;
import com.xworkz.encapsulation.BookStore;

public class BookRunner {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.display();

		BookStore book2 = new BookStore();

		book2.setName("Shivani");

		book2.setPens(true);

		System.out.println(book2.getName());

		System.out.println(book2.getPens());

		book2.noOfLongBooks = 287;

		book2.noOfwhiteBook = 923;

		book2.bookBrand = "Bufna Gold";

		System.out.println(book2.bookBrand);

		System.out.println(book2.noOfLongBooks);

		System.out.println(book2.noOfwhiteBook);

	}

}
