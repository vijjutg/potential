package com.xworkz.task.boot;

import com.xworkz.task.abstrctclass.Vijayalakshmi;

public class Runner {

	public static void main(String[] args) {
		
		Vijayalakshmi vijju = new Vijayalakshmi("Vijayalakshmi","Hosapete" , 22, "Female", 5.6);
		
		vijju.completeProgram();
		
		vijju.paidTax(293.75);
		
		vijju.gst();
		
		vijju.vat();
		
		vijju.training();
		
		vijju.executeProgram();
		
		vijju.uploadTask();
		
		vijju.eat();
		
		vijju.sleep();
	}

}