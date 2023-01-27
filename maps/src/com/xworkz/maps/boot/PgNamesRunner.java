package com.xworkz.maps.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgNamesRunner {

	public static void main(String[] args) {
		
		Map<String, Double> map = new HashMap<String, Double>();
		
		map.put("Kanyaka parameshwari", 6.8);
		map.put("Pamplona House",14.7 );
		map.put("Sai Ram", 6.5);
		map.put("Finclon", 6.5);
		map.put("Langley",13.4 );
		map.put("chatham", 10.2);
		map.put("Vijayalakshmi", 7.5);
		map.put("Sri Hari", 6.0);
		map.put("Brussels", 13.6);
		map.put("Vivaan", 8.0);
		
		System.out.println("number of entries : " + map.size());
		
		Set<String> keys = map.keySet();
		keys.forEach(e -> System.out.println(e));
		
		System.out.println("-----------------------------------");
		
		Collection<Double> pairs = map.values();
		pairs.forEach(e -> System.out.println(e));
		
		System.out.println("-----------------------------------");
		
		Set<Entry<String,Double>> entries = map.entrySet();
		entries.forEach(e -> System.out.println(e));
	}

}
