package com.xworkz.create.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.create.configuration.SpringConfiguration;

public class BeanRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] beanNames = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		System.out.println("----printing String values----");
		String stringRef1 = spring.getBean("chocolate", String.class);
		System.out.println(stringRef1);
		
		String stringRef12 = spring.getBean("email", String.class);
		System.out.println(stringRef12);
		
		String stringRef3 = spring.getBean("mobile", String.class);
		System.out.println(stringRef3);
		
		String stringRef4 = spring.getBean("files", String.class);
		System.out.println(stringRef4);

		String stringRef5 = spring.getBean("apps", String.class);
		System.out.println(stringRef5);
		
		System.out.println("----printing Boolean values----");
		Boolean boolValue1 = spring.getBean("work", Boolean.class);
		System.out.println(boolValue1);
		
		Boolean boolValue2 = spring.getBean("placed", Boolean.class);
		System.out.println(boolValue2);
		
		Boolean boolValue3 = spring.getBean("eat", Boolean.class);
		System.out.println(boolValue3);
		
		Boolean boolValue4 = spring.getBean("charged", Boolean.class);
		System.out.println(boolValue4);
		
		Boolean boolValue5 = spring.getBean("displayed", Boolean.class);
		System.out.println(boolValue5);
		
		System.out.println("----printing Double values----");
		Double doubValue1 = spring.getBean("salary", Double.class);
		System.out.println(doubValue1);
		
		Double doubValue2 = spring.getBean("height", Double.class);
		System.out.println(doubValue2);
		
		Double doubValue3 = spring.getBean("weight", Double.class);
		System.out.println(doubValue3);
		
		Double doubValue4 = spring.getBean("priceOfDolls", Double.class);
		System.out.println(doubValue4);
		
		Double doubValue5 = spring.getBean("quantityOfContents", Double.class);
		System.out.println(doubValue5);
		
		System.out.println("----printing StringBuilder values----");
		StringBuilder buildValue1 = spring.getBean("book", StringBuilder.class);
		System.out.println(buildValue1);
		
		StringBuilder buildValue2 = spring.getBean("age", StringBuilder.class);
		System.out.println(buildValue2);
		
		StringBuilder buildValue3 = spring.getBean("size", StringBuilder.class);
		System.out.println(buildValue3);
		
		StringBuilder buildValue4 = spring.getBean("adult", StringBuilder.class);
		System.out.println(buildValue4);
		
		StringBuilder buildValue5 = spring.getBean("runRate", StringBuilder.class);
		System.out.println(buildValue5);
		
		System.out.println("----printing StringBuffer values----");
		StringBuffer buffValue1 = spring.getBean("doorNumber", StringBuffer.class);
		System.out.println(buffValue1);
		
		StringBuffer buffValue2 = spring.getBean("pinCode", StringBuffer.class);
		System.out.println(buffValue2);
		
		StringBuffer buffValue3 = spring.getBean("married", StringBuffer.class);
		System.out.println(buffValue3);
		
		StringBuffer buffValue4 = spring.getBean("grades", StringBuffer.class);
		System.out.println(buffValue4);
		
		StringBuffer buffValue5 = spring.getBean("planets", StringBuffer.class);
		System.out.println(buffValue5);
		
		System.out.println("----printing ArrayList values----");
		ArrayList<String> arrayValues = spring.getBean("nameList", ArrayList.class);
		arrayValues.forEach(e -> System.out.println(e));
		
		System.out.println("----printing HashMap values----");
		HashMap<String, Long> mapValues = spring.getBean("places", HashMap.class);
		Set<Entry<String, Long>> ref = mapValues.entrySet();
		ref.forEach(e -> System.out.println(e));
		
	}

}
