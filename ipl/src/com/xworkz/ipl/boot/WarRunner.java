package com.xworkz.ipl.boot;

import java.time.LocalDate;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.repository.WarRepoImplement;
import com.xworkz.ipl.repository.WarRepository;

import sun.util.resources.LocaleData;

public class WarRunner {

	public static void main(String[] args) {
		
		WarRepository repository = new WarRepoImplement();
		
		WarDTO dto1 = new WarDTO();
		
		dto1.setName("Kargil War");
		dto1.setStartedBy("Pakistan");
		dto1.setStartedWith("India");
		dto1.setWonBy("India");
		dto1.setStartDate(LocaleData);
        
	}

}
