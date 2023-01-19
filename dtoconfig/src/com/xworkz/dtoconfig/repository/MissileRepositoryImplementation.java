package com.xworkz.dtoconfig.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dtoconfig.dto.MissileDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class MissileRepositoryImplementation implements MissileRepository {

	@Override
	public boolean save(MissileDTO missileDTO) {
		System.out.println("Running save in repo..");
		System.out.println("misselDto : "+   missileDTO);
		return true;
	}

}
