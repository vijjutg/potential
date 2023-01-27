package com.xworkz.ipl.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;

public interface WarRepository {
	
	boolean create(WarDTO dto);
	
	default int total() {
		return 0;
	}
	
	default WarDTO findByStartedBy(String startedBy) {
		return null;
	}
	
	default WarDTO findByStartedByAndStartedWith(String startedWith, String startedBy) {
		return null;
	}
	
	default WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime date) {
		return null;
	}
	
	default WarDTO findByStartDateLessesThanOrEqualTo(LocalDateTime date) {
		return null;
	}
	
	default WarDTO findByStartDateAndEndDate(LocalDateTime start, LocalDateTime end) {
		return null;
	}

}
