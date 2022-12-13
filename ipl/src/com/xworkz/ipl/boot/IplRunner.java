package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepository;
import com.xworkz.ipl.repository.IplRepositoryImpl;

public class IplRunner {

	public static void main(String[] args) {

		IplRepository repo = new IplRepositoryImpl();

		IplDTO dto1 = new IplDTO();

		dto1.setTeamName("RCB");
		dto1.setCaptainName("Virat Kohli");
		dto1.setExtraPlayers(4);
		dto1.setNoOfMatches(65);
		dto1.setWon(false);
		dto1.setCreatedBy("System");
		dto1.setCreatedDate(LocalDateTime.now());

		repo.create(dto1);

		IplDTO dto2 = new IplDTO();

		dto2.setTeamName("CSK");
		dto2.setCaptainName("M S Dhoni");
		dto2.setExtraPlayers(4);
		dto2.setNoOfMatches(60);
		dto2.setWon(true);
		dto2.setCreatedBy("System");
		dto2.setCreatedDate(LocalDateTime.now());

		repo.create(dto2);

		IplDTO dto3 = new IplDTO();

		dto3.setTeamName("MI");
		dto3.setCaptainName("Rohit Sharma");
		dto3.setExtraPlayers(5);
		dto3.setNoOfMatches(70);
		dto3.setWon(true);
		dto3.setCreatedBy("System");
		dto3.setCreatedDate(LocalDateTime.now());

		repo.create(dto3);

		IplDTO dto4 = new IplDTO();

		dto4.setTeamName("Kings XI Panjab");
		dto4.setCaptainName("K L Rahul");
		dto4.setExtraPlayers(3);
		dto4.setNoOfMatches(57);
		dto4.setWon(false);
		dto4.setCreatedBy("System");
		dto4.setCreatedDate(LocalDateTime.now());

		repo.create(dto4);

		IplDTO dto5 = new IplDTO();

		dto5.setTeamName("KKR");
		dto5.setCaptainName("Dinesh Kartik");
		dto5.setExtraPlayers(2);
		dto5.setNoOfMatches(62);
		dto5.setWon(true);
		dto5.setCreatedBy("System");
		dto5.setCreatedDate(LocalDateTime.now());

		repo.create(dto5);

		IplDTO dto6 = new IplDTO();

		dto6.setTeamName("KKR");
		dto6.setCaptainName("Dinesh Kartik");
		dto6.setExtraPlayers(2);
		dto6.setNoOfMatches(62);
		dto6.setWon(true);
		dto6.setCreatedBy("System");
		dto6.setCreatedDate(LocalDateTime.now());

		repo.create(dto6);

		IplDTO dto7 = new IplDTO();

		dto7.setTeamName("GL");
		dto7.setCaptainName("Suresh Raina");
		dto7.setExtraPlayers(4);
		dto7.setNoOfMatches(45);
		dto7.setWon(false);
		dto7.setCreatedBy("System");
		dto7.setCreatedDate(LocalDateTime.now());

		repo.create(dto7);

		IplDTO dto8 = new IplDTO();

		dto8.setTeamName("GL");
		dto8.setCaptainName("Suresh Raina");
		dto8.setExtraPlayers(4);
		dto8.setNoOfMatches(45);
		dto8.setWon(false);
		dto8.setCreatedBy("System");
		dto8.setCreatedDate(LocalDateTime.now());

		repo.create(dto8);

		IplDTO dto9 = new IplDTO();

		dto9.setTeamName("SRH");
		dto9.setCaptainName("Shikar Dhawan");
		dto9.setExtraPlayers(5);
		dto9.setNoOfMatches(67);
		dto9.setWon(true);
		dto9.setCreatedBy("System");
		dto9.setCreatedDate(LocalDateTime.now());

		repo.create(dto9);

		IplDTO dto10 = new IplDTO();

		dto10.setTeamName("DDD");
		dto10.setCaptainName("Shreyas Iyer");
		dto10.setExtraPlayers(3);
		dto10.setNoOfMatches(63);
		dto10.setWon(false);
		dto10.setCreatedBy("System");
		dto10.setCreatedDate(LocalDateTime.now());

		repo.create(dto10);

		//IplDTO dto11 = new IplDTO();

		//dto10.setTeamName("DDD");
		//dto10.setCaptainName("Shreyas Iyer");
		//dto10.setExtraPlayers(3);
		//dto10.setNoOfMatches(63);
		//dto10.setWon(false);
		//dto10.setCreatedBy("System");
		//dto10.setCreatedDate(LocalDateTime.now());

		//repo.create(dto11);
		
		int res = repo.total();
		System.out.println("No of elements: "+res);
	}

}
