package com.xworkz.dtoconfig.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dtoconfig.dto.FirstAidDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class FirstAidRepositoryImplementation implements FirstAidRepository{

	@Override
	public boolean save(FirstAidDTO aidDto) {
		System.out.println("Running save in repo..");
		System.out.println("aidDto : "+   aidDto);
		return true;
	}

}
