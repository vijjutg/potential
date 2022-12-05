package com.xworkz.task.abstrctclass;

public abstract class Person {
	
	private String name;
	private String place;
	private int age;
	private String gender;
	private double height;
	
	abstract boolean eat();
	
	abstract double sleep();

	public Person(String name, String place, int age, String gender, double height) {
		super();
		this.name = name;
		this.place = place;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
