package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.exception.ArraySizeExceededException;

public class IplRepositoryImpl implements IplRepository {

	private IplDTO[] iplDto = new IplDTO[10];

	private int index = 0;

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("Running create method..");
		if (this.index >= this.iplDto.length) {
			throw new ArraySizeExceededException();
		}
		this.iplDto[this.index] = dto;
		System.out.println("Saved " + dto + dto.hashCode() + " In index " + this.index);
		this.index++;

		return true;

	}

	@Override
	public int total() {
		return this.index;
	}

}
