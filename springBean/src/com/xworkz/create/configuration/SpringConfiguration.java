package com.xworkz.create.configuration;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.create")
@Configuration
public class SpringConfiguration {
	
	@Bean
	public String chocolate() {
		System.out.println("Registered chocolate with spring..");
		String choco = new String("Dairy Milk");
		return choco;
	}
	
	@Bean
	public String email() {
		System.out.println("Registered email with spring..");
		String mail = new String("vijjutg@gmail.com");
		return mail;
	}
	
	@Bean
	public String mobile() {
		System.out.println("Registered mobile with spring..");
		String setName = new String("Samsung Galaxy J2 pro");
		return setName;
	}
	
	@Bean
	public String files() {
		System.out.println("Registered files with spring..");
		String doc = new String("pdf");
		return doc;
	}
	
	@Bean
	public String apps() {
		System.out.println("Registered apps with spring..");
		String name = new String("Instagram");
		return name;
	}
	
	@Bean
	public Boolean work() {
		System.out.println("Registered work with spring..");
		return true;
	}
	
	@Bean
	public Boolean placed() {
		System.out.println("Registered placed with spring..");
		return false;
	}
	
	@Bean
	public Boolean eat() {
		System.out.println("Registered eat with spring..");
		return true;
	}
	
	@Bean
	public Boolean charged() {
		System.out.println("Registered charged with spring..");
		return false;
	}
	
	@Bean
	public Boolean displayed() {
		System.out.println("Registered displayed with spring..");
		return true;
	}
	
	@Bean
	public Double salary() {
		System.out.println("Registered salary with spring..");
		return 27.8;
	}
	
	@Bean
	public Double height() {
		System.out.println("Registered Height with spring..");
		return 1.68;
	}
	
	@Bean
	public Double weight() {
		System.out.println("Registered weight with spring..");
		return 40.6;
	}
	
	@Bean
	public Double priceOfDolls() {
		System.out.println("Registered priceOfDolls with spring..");
		return 500D;
	}
	
	@Bean
	public Double quantityOfContents() {
		System.out.println("Registered quantityOfContents with spring..");
		return 45.9;
	}
	
	@Bean
	public StringBuilder book() {
		System.out.println("Registered book with spring..");
		StringBuilder stringBuild = new StringBuilder();
		StringBuilder ref = stringBuild.append("Kaviraja Marga");
		return ref;
	}
	
	@Bean
	public StringBuilder age() {
		System.out.println("Registered age with spring..");
		StringBuilder stringBuild = new StringBuilder();
		StringBuilder ref = stringBuild.append(22);
		return ref;
	}
	
	@Bean
	public StringBuilder size() {
		System.out.println("Registered size with spring..");
		StringBuilder stringBuild = new StringBuilder();
		StringBuilder ref = stringBuild.append('S');
		return ref;
	}
	
	@Bean
	public StringBuilder adult() {
		System.out.println("Registered adult with spring..");
		StringBuilder stringBuild = new StringBuilder();
		StringBuilder ref = stringBuild.append(true);
		return ref;
	}
	
	@Bean
	public StringBuilder runRate() {
		System.out.println("Registered runRate with spring..");
		StringBuilder stringBuild = new StringBuilder();
		StringBuilder ref = stringBuild.append(135.8);
		return ref;
	}
	
	@Bean
	public StringBuffer planets() {
		System.out.println("Registered planets with spring..");
		StringBuffer stringBuff = new StringBuffer();
		StringBuffer ref = stringBuff.append("Venus");
		return ref;
	}
	
	@Bean
	public StringBuffer doorNumber() {
		System.out.println("Registered doorNumber with spring..");
		StringBuffer stringBuff = new StringBuffer();
		StringBuffer ref = stringBuff.append("254A");
		return ref;
	}
	
	@Bean
	public StringBuffer pinCode() {
		System.out.println("Registered pinCode with spring..");
		StringBuffer stringBuff = new StringBuffer();
		StringBuffer ref = stringBuff.append(583135);
		return ref;
	}
	
	@Bean
	public StringBuffer married() {
		System.out.println("Registered married with spring..");
		StringBuffer stringBuff = new StringBuffer();
		StringBuffer ref = stringBuff.append(false);
		return ref;
	}
	
	@Bean
	public StringBuffer grades() {
		System.out.println("Registered grades with spring..");
		StringBuffer stringBuff = new StringBuffer();
		StringBuffer ref = stringBuff.append('A');
		return ref;
	}
	
	@Bean
	public ArrayList nameList() {
		System.out.println("Registered nameList with spring..");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Vijju");
		list.add("Bharath");
		list.add("Giutham");
		list.add("Prajju");
		list.add("Priya");
		return list;
	}
	
	@Bean
	public HashMap places() {
		System.out.println("Registered places with spring..");
		HashMap<String, Long> codes = new HashMap<String, Long>();
		codes.put("Kudligi",  583135L);
		codes.put("Hosapete", 525823L);
		codes.put("Bellary",  543714L);
		codes.put("Koppal",  532863L);
		codes.put("Rajajinagar",  523001L);
		return codes;
	}
		
}
 