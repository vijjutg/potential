package com.xworkz.createEvent.events;

public class SweetNameImplement implements SweetRepo{
	
	private String[] name = new String[10];
	private int count = 0;

	@Override
	public int sweetName(String name) {
		System.out.println("Running sweet method..");
		if(this.count > this.name.length) {
			throw new SweetNameExceededException();
		}
		this.name[count] = name;
		this.count++;
		return 0;
	}
	
}
