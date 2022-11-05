package com.xworkz.encapsulation;

public class BookStore {

	private String name = "Kusuma";
	String ownerName = "Narayana";
	int noOfItems = 28392;
	String mainItem = "Books";
	double price = 879;
	long phoneNo = 7608975756l;
	double lengthOfBooks = 27.9;
	private boolean pens;
	public int noOfLongBooks;
	public String bookBrand;
	public int noOfwhiteBook;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPens(boolean pens) {
		this.pens = pens;
	}

	public boolean getPens() {
		return pens;
	}

}
