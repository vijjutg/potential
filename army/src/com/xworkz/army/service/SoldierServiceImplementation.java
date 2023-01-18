package com.xworkz.army.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.army.dto.SoldierDto;
import com.xworkz.army.repository.SoldierRepository;

public class SoldierServiceImplementation implements SoldierService {

	private SoldierRepository repo;

	public void setRepository(SoldierRepository repository) {
		this.repo = repository;
	}

	@Override
	public boolean ValidateAndSave(SoldierDto dto) {
		System.out.println("Running validate and save method...");
		System.out.println("passed dto: " + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDto>> violation = validator.validate(dto);

		if (!violation.isEmpty()) {
			System.err.println("Error is there..");
			violation.forEach(c -> System.err.println(c.getMessage()));
			return false;
		} 
		else 
		{
			System.out.println("No validation errors...");

			boolean saved = repo.save(dto);
			System.out.println("The data saved to repo : " + saved);

			return true;
		}

	}

}
