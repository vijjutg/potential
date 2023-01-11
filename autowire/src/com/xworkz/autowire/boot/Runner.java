package com.xworkz.autowire.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowire.beans.Apps;
import com.xworkz.autowire.beans.HardwareShop;
import com.xworkz.autowire.beans.Pencil;
import com.xworkz.autowire.beans.Rubber;
import com.xworkz.autowire.beans.Software;
import com.xworkz.autowire.beans.SoftwareEngineer;
import com.xworkz.autowire.configuration.BeanConfiguration;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		HardwareShop refOfShop = container.getBean(HardwareShop.class);
		System.out.println(refOfShop);
		
		System.out.println("----------------------------------------------------------------------");
		
		Software refOfSoftware = container.getBean(Software.class);
		System.out.println(refOfSoftware);
		
		System.out.println("----------------------------------------------------------------------");
		
		SoftwareEngineer refOfEngineer = container.getBean(SoftwareEngineer.class);
		System.out.println(refOfEngineer);
		
		System.out.println("----------------------------------------------------------------------");
		
		Pencil reOfPencil = container.getBean(Pencil.class);
		System.out.println(reOfPencil);
		
		System.out.println("----------------------------------------------------------------------");
		
		Rubber refOfRubber = container.getBean(Rubber.class);
		System.out.println(refOfRubber);
		
		System.out.println("----------------------------------------------------------------------");
		
		Apps refOfApps = container.getBean(Apps.class);
		System.out.println(refOfApps);

	}
}
