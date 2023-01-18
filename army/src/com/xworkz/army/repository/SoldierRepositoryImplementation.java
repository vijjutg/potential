package com.xworkz.army.repository;

import com.xworkz.army.dto.SoldierDto;

public class SoldierRepositoryImplementation implements SoldierRepository {

	@Override
	public boolean save(SoldierDto dto) {
		System.out.println("Saved dto ....");
		return false;
	}

}
