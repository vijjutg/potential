package com.xworkz.encapsulation;

public class Temple {
	
	String godName = "Ganesha";
	String location = "Idagunji";
	String spcial = "Dvibhuja style";
	int noOfGods = 4;
	int constYear = 1467;
	private String constructor = "The devotees";
	private double amount = 875878;
	public double area = 86;
	public double heigth = 76.9;
	public String prasada = "Laddu ";
	public boolean old = true;
	
	public void setConstructor(String constructor) {
		this.constructor = constructor;
	}

	public String getConstructor() {
		return constructor;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
