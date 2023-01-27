package com.xworkz.createEvent.events;

public interface EmailRepo {
	
	boolean fetchEmail(String email);
	
	default int total() {
		return 10;
	}

}
