package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Cities {
	
//	Create a Map from array of cities that will sort keys in alphabetical order. 
//	As a key store the name of the city and as a value store the length of the city
//	(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//	If any city name is more than 7 characters remove that city . 
	
	public static void main(String[] args) {
		
		Map<String, Integer> cities = new TreeMap<>();
		cities.put("New York", 52);
		cities.put("Maine", 300);
		cities.put("Utah", 238);
		cities.put("Ohio", 283);
		cities.put("Oregon", 241);
		cities.put("Texas", 69);
		System.out.println(cities);
		
		Set<Entry<String,Integer>> keys = cities.entrySet();
		Iterator<Entry<String,Integer>> it = keys.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> city = it.next();
			if(city.getKey().length()>7) {
				it.remove();
			}
		}
		System.out.println(cities);
		
		
	}

}
