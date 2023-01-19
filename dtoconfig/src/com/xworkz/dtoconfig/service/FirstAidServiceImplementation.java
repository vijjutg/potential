package com.xworkz.dtoconfig.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dtoconfig.dto.FirstAidDTO;
import com.xworkz.dtoconfig.repository.FirstAidRepository;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class FirstAidServiceImplementation implements FirstAidService {

	@Autowired
	private Validator validator;
	@Autowired
	private FirstAidRepository firstaidRepo;
	
	public void setValidator(Validator validator) {
		this.validator = validator;
	}
	
	@Override
	public boolean validateAndSave(FirstAidDTO aidDto) {
		System.out.println("Running Validate and save..");
		System.out.println("Dto passes : " + aidDto);
		
		Set<ConstraintViolation<FirstAidDTO>> violations = this.validator.validate(aidDto);
		
		if(!violations.isEmpty()) {
			System.out.println("there are validation error..");
			violations.forEach(cv -> System.err.println(cv.getMessage()));
			return false;
		}
		else {
			System.out.println("Data is valid...");
			boolean saved = this.firstaidRepo.save(aidDto);
			System.out.println("Saved first aid " +saved);
			return saved;
		}
	}

}
