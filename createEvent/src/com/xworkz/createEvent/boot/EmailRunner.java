package com.xworkz.createEvent.boot;

import com.xworkz.createEvent.events.EmailRepo;
import com.xworkz.createEvent.events.EmailRepoImplement;

public class EmailRunner {

	public static void main(String[] args) {
		
		EmailRepo emailRepo = new EmailRepoImplement();
		
		emailRepo.fetchEmail("tgvijayalakshmi92@gmail.com");
		
		emailRepo.fetchEmail("tgshivu@gmail.com");
		
		emailRepo.fetchEmail("tgbasavaraj@gmail.com");
		
		emailRepo.fetchEmail("tgvinay@gmail.com");
		
		emailRepo.fetchEmail("tgakash@gmail.com");
		
		emailRepo.fetchEmail("tgmamatha@gmail.com");
		
		emailRepo.fetchEmail("tgbharath@gmail.com");
		
		emailRepo.fetchEmail("tgsiddesh@gmail.com");
		
		emailRepo.fetchEmail("tgveeresh@gmail.com");
		
		emailRepo.fetchEmail("tgkotresh@gmail.com");
		
		emailRepo.fetchEmail("tgkruthika@gmail.com");
		
		System.out.println(emailRepo.total());

	}

}
