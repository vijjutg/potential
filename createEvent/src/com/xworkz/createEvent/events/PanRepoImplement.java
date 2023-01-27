package com.xworkz.createEvent.events;

public class PanRepoImplement implements PanRepo{
	
	private String[] number = new String[10];
	
	private int count = 0;

	@Override
	public boolean panno(String number) {
		System.out.println("Running pan method..");
		if (this.count > this.number.length) {
			throw new panNumberExceededException();
		}
		this.number[count] = number;
		this.count++;
		return false;
	}

}
