package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImplement;

public class PizzaRunner {

	public static void main(String[] args) {
		
		PizzaDTO pizzaDTO = new PizzaDTO("corn cheese", "Dominos", PizzaSize.LARGE, true, 310, "Corn and Cheese", "VEG", "System", LocalDateTime.now(), null, null);
		System.out.println();
		
		PizzaService service=new PizzaServiceImplement();
		service.validateAndSave(pizzaDTO);
	}

}
