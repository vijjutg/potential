package com.xworkz.copy.boot;

import com.xworkz.copy.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		
		Developer ref = new Developer();
		
		ref.name = "Vijayalakshmi T G";
		ref.education = "Engineering";
		ref.experience = 2;
		ref.salary = 4.5;
		ref.company = "Accenture";
		
		System.out.println("The name of developer is : "+ ref.name);
		System.out.println("The education of developer is : "+ ref.education);
		System.out.println("The experience of developer is : "+ ref.experience);
		System.out.println("The salary of developer is : "+ ref.salary);
		System.out.println("The company of developer is : "+ ref.company);

	}

}
