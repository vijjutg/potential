package com.xworkz.collection;

import java.util.Collection;
import java.util.HashSet;

public class CouponRunner {

	public static void main(String[] args) {
		
		Collection couponCollection = new HashSet();
		
		String coupon1 = "46g778h";
		String coupon2 = "v68o8vb";
		String coupon3 = "vr76b87";
		String coupon4 = "yvt87b98";
		String coupon5 = "587btubu";
		String coupon6 = "65vu777r";
		String coupon7 = "6vr67t76";
		String coupon8 = "5e4e655t";
		String coupon9 = "x4we54ce";
		String coupon10 = "rx4wd54";
		String coupon11= "4e5ec5t6";
		String coupon12= "tre56v6";
		
		couponCollection.add(coupon1);
		couponCollection.add(coupon2);
		couponCollection.add(coupon3);
		couponCollection.add(coupon4);
		couponCollection.add(coupon5);
		couponCollection.add(coupon6);
		couponCollection.add(coupon7);
		couponCollection.add(coupon8);
		couponCollection.add(coupon9);
		couponCollection.add(coupon10);
		couponCollection.add(coupon11);
		couponCollection.add(coupon12);
		
		System.out.println(couponCollection.size());
		
		couponCollection.clear();
		
		System.out.println("After clear..");
		
		System.out.println(couponCollection.size());
		
	}

}
