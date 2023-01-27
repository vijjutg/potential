package com.xworkz.maps.boot;

import java.util.Map;
import java.util.TreeMap;

public class CountryRunner {

	public static void main(String[] args) {

		Map<String, String> presidents = new TreeMap<String, String>();

		presidents.put("China", "Xi Jinping");
		presidents.put("India", "Droupadi Murmu");
		presidents.put("Kazakhstan", "Kassym-Jomart Kemeluly Tokayev");
		presidents.put("Saudi Arabia", "King-Salman");
		presidents.put("Iran", "Hassan Rouhani");
		presidents.put("Mangolia", "Khaltmaagiin Battulga");
		presidents.put("Indonesia", "Joko Widodo");
		presidents.put("Pakistan", "Arif Alvi");
		presidents.put("Afghanistan", "Mohammed Hassan Akhund");
		presidents.put("Yemen", "Mahdi al-Mashat");
		presidents.put("Thailand", "King-Maha Vajiralongkorn");
		presidents.put("Turkmenistan", "Serdar Berdimuhamedow");
		presidents.put("Uzbekistan", "Shavkat Mirziyoyey");
		presidents.put("Iraq", "Adbul Latif Rashid");
		presidents.put("Japan", "Naruhito");
		presidents.put("Vietnam", "Nguyen Xuan phuc");
		presidents.put("Malaysia", "Yang di-Pertuan Agong");
		presidents.put("Philippines", "Bongbong Marcos");
		presidents.put("Kyrgyzstan", "Sadyr Japarov");
		presidents.put("Syria", "Bashar al-Assad");

		System.out.println("Number of entries : " + presidents.size());
		
		presidents.forEach((key,value)->System.out.println("Keys : "+key +" --  values : " +value));
		
	}

}
