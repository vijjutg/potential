package com.xworkz.boot;

import com.xworkz.methods.Paint;

public class PaintRunner {


	public static void main(String[] args) {
		
		Paint paint1 = new Paint();
		paint1.setBrand("Nippon");
       
		Paint paint2 = new Paint("Asian");
		
		boolean result = paint1.equals(paint2);
		System.out.println(result);
		
		System.out.println(paint1.toString());
		System.out.println(paint2.toString());
		
	}

}
