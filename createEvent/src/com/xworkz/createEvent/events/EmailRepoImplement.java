package com.xworkz.createEvent.events;

public class EmailRepoImplement implements EmailRepo{
	
	private String[] emails = new String[10];
	
	private int count = 0;

	@Override
	public boolean fetchEmail(String email) {
		System.out.println("Running fetch email method...");
		if(this.count > this.emails.length) {
			throw new emailSizeExceededException();
		}
		this.emails[count] = email;
		this.count++;
		return false;
	}

	@Override
	public int total() {
		System.out.println("Running total method...");
		return EmailRepo.super.total();
	}

}
