package com.xworkz.autowire.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowire")
public class BeanConfiguration {

	@Bean
	public int num() {
		System.out.println("Registered num using spring...");
		return 25;
	}

	@Bean
	public String shopName() {
		System.out.println("Registered shopName using spring...");
		return "Comptech";
	}

	@Bean
	public String gstNum() {
		System.out.println("Registered gstNum using spring...");
		return "3286J9YE87";
	}

	@Bean
	public String owner() {
		System.out.println("Registered owner using spring...");
		return "Goutham";
	}

	@Bean
	public String place() {
		System.out.println("Registered place using spring...");
		return "Kudligi";
	}

	@Bean
	public String nameOfSoftware() {
		System.out.println("Registered nameOfSoftware using spring...");
		return "Eclipse";
	}

	@Bean
	public double softwareVersion() {
		System.out.println("Registered softwareVersion using spring...");
		return 1.8;
	}

	@Bean
	public String developerName() {
		System.out.println("Registered developerName using spring...");
		return "Johnson";
	}

	@Bean
	public String dateOfRelease() {
		System.out.println("Registered dateOfRelease using spring...");
		return "26-7-2018";
	}

	@Bean
	public boolean isFree() {
		System.out.println("Registered isFree using spring...");
		return true;
	}

	@Bean
	public String nameOfEngineer() {
		System.out.println("Registered nameOfEngineer using spring...");
		return "Vijayalakshmi";
	}

	@Bean
	public double salary() {
		System.out.println("Registered salary using spring...");
		return 4.5;
	}

	@Bean
	public String companyName() {
		System.out.println("Registered companyName using spring...");
		return "Accenture";
	}

	@Bean
	public int experience() {
		System.out.println("Registered experience using spring...");
		return 3;
	}

	@Bean
	public String pencilName() {
		System.out.println("Registered pencilName using spring...");
		return "Apsara";
	}

	@Bean
	public String pencilType() {
		System.out.println("Registered pencilType using spring...");
		return "Pen pencil";
	}

	@Bean
	public double amount() {
		System.out.println("Registered amount using spring...");
		return 5.0;
	}

	@Bean
	public String color() {
		System.out.println("Registered color using spring...");
		return "Grey";
	}

	@Bean
	public boolean sharp() {
		System.out.println("Registered sharp using spring...");
		return true;
	}

	@Bean
	public boolean stolen() {
		System.out.println("Registered stolen using spring...");
		return true;
	}

	@Bean
	public String rubberName() {
		System.out.println("Registered rubberName using spring...");
		return "Apsara";
	}

	@Bean
	public String rubberType() {
		System.out.println("Registered rubberType using spring...");
		return "Dustless";
	}

	@Bean
	public double rubberprice() {
		System.out.println("Registered rubberprice using spring...");
		return 5.0;
	}

	@Bean
	public String rubberColor() {
		System.out.println("Registered color using spring...");
		return "White";
	}

	@Bean
	public String shape() {
		System.out.println("Registered shape using spring...");
		return "Rectangle";
	}

	@Bean
	public char size() {
		System.out.println("Registered size using spring...");
		return 'M';
	}

	@Bean
	public short time() {
		System.out.println("Registered time using spring...");
		return 1;
	}

	@Bean
	public byte number() {
		System.out.println("Registered number using spring...");
		return 28;
	}
	
	@Bean
	public int numOfUsers() {
		System.out.println("Registered numOfUsers using spring...");
		return 3766;
	}
	
	@Bean
	public long idNum() {
		System.out.println("Registered idNum using spring...");
		return 9867856654l;
	}
	
	@Bean
	public float sizeOfApp() {
		System.out.println("Registered sizeOfApp using spring...");
		return 48.3f;
	}
	
	@Bean
	public double amountOfApp() {
		System.out.println("Registered amountOfApp using spring...");
		return 28397399.76;
	}
	
	@Bean
	public boolean userFriendly() {
		System.out.println("Registered userFriendly using spring...");
		return true;
	}
	
	@Bean
	public char rate() {
		System.out.println("Registered rate using spring...");
		return 'A';
	}

	@Bean
	public String appName() {
		System.out.println("Registered appName using spring...");
		return "Youtube";
	}

}
