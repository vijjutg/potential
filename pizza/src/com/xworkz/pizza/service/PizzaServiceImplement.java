package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;

public class PizzaServiceImplement implements PizzaService {

	@Override
	public boolean validateAndSave(PizzaDTO dto) {
		System.out.println("Running validate method..");
		String name = dto.getName();
		String company = dto.getCompany();
		String flavour = dto.getFlavour();
		PizzaSize size = dto.getSize();
		double price = dto.getPrice();
		String type = dto.getType();
		boolean validName = false;
		boolean validcompany = false;
		boolean validSize = false;
		boolean validPrice = false;
		boolean validFlavour = false;
		boolean validType = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Name is valid");
			validName = true;
		}
		else {
			System.out.println("name is invalid");
		}

		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("Comapny Name is valid");
			validcompany = true;
		}
		else {
			System.out.println("comapny is invalid");
		}
		
		if (size!=null) {
			System.out.println("size is valid");
			validSize = true;
		}
		else {
			System.out.println("size is invalid");
		}
		
		if (price > 50 && price < 2000) {
			System.out.println("price is valid");
			validPrice = true;
		}
		else {
			System.out.println("price is invalid");
		}
		
		if (flavour != null && flavour.length() >= 3 && flavour.length() <= 20) {
			System.out.println("flavour is valid");
			validFlavour = true;
		}
		else {
			System.out.println("flavour is invalid");
		}
		
		if (type != null && type == "VEG" || type == "NON-VEG") {
			System.out.println("type is valid..");
			validType = true;
		}
		else {
			System.out.println("type is invalid");
		}
		
		if (validName && validcompany && validSize && validPrice && validFlavour && validType) {
			return true;
		}

		return false;
	}

}
