package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.custom.Criminal;

public class Ravi extends Criminal{
	
	public boolean bailReceived;

	public Ravi(String name, int age) {
		super(name, age);
	}

	public Ravi(String name, int age, boolean bailReceived) {
		super(name, age);
		this.bailReceived = bailReceived;
	}
	
	public void display()
	{
		super.display();
		System.out.println(this.bailReceived);
	}

}
