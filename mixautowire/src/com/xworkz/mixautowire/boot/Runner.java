package com.xworkz.mixautowire.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mixautowire.beans.NewsPaper;
import com.xworkz.mixautowire.configuration.BeanConfigution;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(BeanConfigution.class);
		String[] beanNames = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		System.out.println(container.getBeanDefinitionCount());
		
		NewsPaper refOfPaper = container.getBean(NewsPaper.class);
		System.out.println(refOfPaper);

	}

}
