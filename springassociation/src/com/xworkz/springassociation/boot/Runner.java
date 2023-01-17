package com.xworkz.springassociation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springassociation.beans.Chrome;
import com.xworkz.springassociation.beans.FireBox;
import com.xworkz.springassociation.configuration.NetworkConfiguration;
import com.xworkz.springassociation.rules.Browser;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext network = new AnnotationConfigApplicationContext(NetworkConfiguration.class);
		
		System.out.println(Arrays.toString(network.getBeanDefinitionNames()));
		
		System.out.println(network.getBeanDefinitionCount());
		
		Browser ref = network.getBean(Chrome.class);
		System.out.println(ref);
		ref.browse();
		
		Browser ref1 = network.getBean(FireBox.class);
		System.out.println(ref1);
		ref1.browse();

	}

}
