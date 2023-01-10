package com.xworkz.initvars.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.initvars.beans.Actor;
import com.xworkz.initvars.beans.Rocket;
import com.xworkz.initvars.beans.Season;
import com.xworkz.initvars.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		Rocket refOfRock = container.getBean("rocket", Rocket.class);
		System.out.println(refOfRock);
		System.out.println(refOfRock.getCountry());
		System.out.println(refOfRock.getName());
		System.out.println(refOfRock.getBudget());
		
		Rocket refOfRock1 = container.getBean("satellite", Rocket.class);
		System.out.println(refOfRock1);
		System.out.println(refOfRock1.getCountry());
		System.out.println(refOfRock1.getName());
		System.out.println(refOfRock1.getBudget());
		
		System.out.println("---------------------------------------------");
		
		Actor refOfActor = container.getBean("actor", Actor.class);
		System.out.println(refOfActor);
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.getLang());
		System.out.println(refOfActor.getAge());
		
		Actor refOfActor1 = container.getBean("hero", Actor.class);
		System.out.println(refOfActor1);
		System.out.println(refOfActor1.getName());
		System.out.println(refOfActor1.getLang());
		System.out.println(refOfActor1.getAge());
		
		System.out.println("---------------------------------------------");
		
		Season refOfSeason = container.getBean("season", Season.class);
		System.out.println(refOfSeason);
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getDuration());
		System.out.println(refOfSeason.getStartingMonth());
		
		Season refOfSeason1 = container.getBean("wether", Season.class);
		System.out.println(refOfSeason1);
		System.out.println(refOfSeason1.getName());
		System.out.println(refOfSeason1.getDuration());
		System.out.println(refOfSeason1.getStartingMonth());
		
	}

}
