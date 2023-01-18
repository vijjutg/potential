package com.xworkz.terrorist.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.terrorist.dto.TerroristDTO;

public class TerroristSericeImplementation implements TerroristService {

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("Running validate and save in implements..");
		System.out.println("Dto passed :"+ dto);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations = validator.validate(dto);
		if(!violations.isEmpty()) {
			System.err.println("Error is there..");
			violations.forEach(c -> System.err.println(c.getMessage()));
			return false;
		}
		System.out.println("No validation errors...");
		return true;
	}

}
