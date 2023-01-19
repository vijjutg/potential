package com.xworkz.dtoconfig.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dtoconfig.dto.FirstAidDTO;
import com.xworkz.dtoconfig.dto.MissileDTO;
import com.xworkz.dtoconfig.repository.FirstAidRepository;
import com.xworkz.dtoconfig.repository.MissileRepository;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class MissileServiceImplementation implements MissileService {

	@Autowired
	private Validator validator;
	@Autowired
	private MissileRepository missileRepo;

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(MissileDTO missileDto) {
		System.out.println("Running Validate and save..");
		System.out.println("Dto passes : " + missileDto);

		Set<ConstraintViolation<MissileDTO>> violations = this.validator.validate(missileDto);

		if (!violations.isEmpty()) {
			System.out.println("there are validation error..");
			violations.forEach(cv -> System.err.println(cv.getMessage()));
			return false;
		} else {
			System.out.println("Data is valid...");
			boolean saved = this.missileRepo.save(missileDto);
			System.out.println("Saved first aid " + saved);
			return saved;
		}
	}

}
