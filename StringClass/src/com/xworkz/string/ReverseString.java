package com.xworkz.string;

public abstract class ReverseString {

	public static void main(String[] args) {
		
		String str = "Vijayalakshmi";
		String reverse = "";
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--) {
			reverse = reverse + ch[i];
		}
		System.out.println(reverse);
		System.out.println("------------------------------------------------");
		
		for(int i=str.length()-1; i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
	}

}
