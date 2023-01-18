package com.xworkz.army.boot;

import com.xworkz.army.dto.SoldierDto;
import com.xworkz.army.repository.SoldierRepository;
import com.xworkz.army.repository.SoldierRepositoryImplementation;
import com.xworkz.army.service.SoldierServiceImplementation;

public class SoldierRunner {

	public static void main(String[] args) {
		
		SoldierDto dto = new SoldierDto(2, "Ajay Kumar", "Topper", "India");
		
		SoldierServiceImplementation service = new SoldierServiceImplementation();
		service.ValidateAndSave(dto);
		
		SoldierRepository ref = new SoldierRepositoryImplementation();
		service.setRepository(ref);
		
		System.out.println(service);

	}

}
