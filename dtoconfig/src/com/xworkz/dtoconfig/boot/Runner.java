package com.xworkz.dtoconfig.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dtoconfig.configuration.FirstAidConfiguration;
import com.xworkz.dtoconfig.dto.FirstAidDTO;
import com.xworkz.dtoconfig.dto.MissileDTO;
import com.xworkz.dtoconfig.dto.ResortDTO;
import com.xworkz.dtoconfig.service.FirstAidService;
import com.xworkz.dtoconfig.service.MissileService;
import com.xworkz.dtoconfig.service.ResortService;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(FirstAidConfiguration.class);

		FirstAidService service = container.getBean(FirstAidService.class);

		boolean saved = service.validateAndSave(new FirstAidDTO());

		System.out.println("---------------------------------------------------------------------");

		MissileService service1 = container.getBean(MissileService.class);

		boolean saved1 = service1.validateAndSave(new MissileDTO());

		System.out.println("---------------------------------------------------------------------");

		ResortService service2 = container.getBean(ResortService.class);

		boolean saved2 = service2.validateAndSave(new ResortDTO());
	}

}
