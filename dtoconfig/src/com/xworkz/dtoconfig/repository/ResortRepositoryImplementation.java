package com.xworkz.dtoconfig.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dtoconfig.dto.ResortDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class ResortRepositoryImplementation implements ResortRepository {

	@Override
	public boolean save(ResortDTO resortDTO) {
		System.out.println("Running save in repo..");
		System.out.println("ResortDto : "+   resortDTO);
		return true;
	}

}
