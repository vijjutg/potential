package com.xworkz.terrorist.boot;

import com.xworkz.terrorist.dto.TerroristDTO;
import com.xworkz.terrorist.services.TerroristSericeImplementation;
import com.xworkz.terrorist.services.TerroristService;

public class Runner {

	public static void main(String[] args) {
		
		TerroristDTO dto = new TerroristDTO();
		
		dto.setName("Bin Ladon");
		dto.setAge(-45);
		dto.setCountry("Pakistan");
		System.out.println(dto);

		TerroristService service = new TerroristSericeImplementation();
		service.validateAndSave(dto);
	}

}
