package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
//		Store students id and corresponding name		
		Map<Integer, String>lmap = new LinkedHashMap<>();
		lmap.put(1000, "John Smith");
		lmap.put(1001, "Jane Smith");
		lmap.put(1002, "Faisal Sakhi");
		lmap.put(102, "Ali Tarlaci");
		
		System.out.println(lmap); // Order of our entries preserved
		System.out.println("-----------------------TreeMap-----------------------");
		
//		Store objects in a form of K and V and you want to sort your keys in Ascending Order
		
		Map<Integer,String> tmap = new TreeMap<>();
		tmap.put(1000, "John Smith");
		tmap.put(1001, "Jane Smith");
		tmap.put(1002, "Faisal Sakhi");
		tmap.put(102, "Ali Tarlaci");
		System.out.println(tmap);
		
//		Create a  map of Country and population and sort countries in Alphabetical order
		
		Map<String, Integer>country = new TreeMap<>();
		country.put("USA", 330000000);
		country.put("Kazakhstan", 18000000);
		country.put("India",1326000000);
		country.put("Afghanistan", 37000000);
		
		System.out.println(country);//Now it sorted in alphabetical order
		
	}
}
