package com.xworkz.methods;

public class Currency {
	
	private String country;
	private String type;
	private int quantity;
	private String name;
	private double value;
	private boolean running;
	private String color;
	private double weight;
	private int noOfStates;
	private String language;
	
	public Currency() {
		System.out.println("Default const in currency..");
	}

	public Currency(String country, boolean running, String color, String language) {
		super();
		this.country = country;
		this.running = running;
		this.color = color;
		this.language = language;
	}

	@Override
	public String toString() {
		return "Currency [country=" + country + ", running=" + running + ", color=" + color + ", language=" + language
				+ "]";
	}
	
	@Override
	public boolean equals(Object other) {
		System.out.println("Equal method overridden..");
		if(other instanceof Currency) {
			System.out.println("other is instance of currency, check the properties..");
			Currency cast = (Currency) other;
			if(this.color.equals(cast.color) && this.country.equals(cast.country))  { 
					if( this.running == cast.running && this.language.equals(cast.language)) {
				System.out.println("Both objects are equal..");
				return true;
			}
			}
		}
		else {
			System.err.println("other is not instance of currency");
		}
		return false;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getNoOfStates() {
		return noOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
