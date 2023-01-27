package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.exception.ArraySizeExceededException;

public class WarRepoImplement implements WarRepository {
	
	private WarDTO[] warDto = new WarDTO[10];
	
	private int count = 0;
	
	@Override
	public boolean create(WarDTO dto) {
		System.out.println("Running craete method..");
		if (this.count >= this.warDto.length) {
			throw new ArraySizeExceededException();
		}
		this.warDto[this.count] = dto;
		System.out.println("Saved " + dto + dto.hashCode() + " In index " + this.count);
		this.count++;
		return true;
	}
	
	@Override
	public int total() {
		System.out.println("Running total method..");
		return this.count;
	}
}
