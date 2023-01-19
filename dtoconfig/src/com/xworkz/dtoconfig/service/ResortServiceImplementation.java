package com.xworkz.dtoconfig.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dtoconfig.dto.MissileDTO;
import com.xworkz.dtoconfig.dto.ResortDTO;
import com.xworkz.dtoconfig.repository.MissileRepository;
import com.xworkz.dtoconfig.repository.ResortRepository;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class ResortServiceImplementation implements ResortService {

	@Autowired
	private Validator validator;
	@Autowired
	private ResortRepository resortRepo;

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(ResortDTO resortDto) {

		System.out.println("Running Validate and save..");
		System.out.println("Dto passes : " + resortDto);

		Set<ConstraintViolation<ResortDTO>> violations = this.validator.validate(resortDto);

		if (!violations.isEmpty()) {
			System.out.println("there are validation error..");
			violations.forEach(cv -> System.err.println(cv.getMessage()));
			return false;
		} else {
			System.out.println("Data is valid...");
			boolean saved = this.resortRepo.save(resortDto);
			System.out.println("Saved first aid " + saved);
			return saved;
		}
	}

}
