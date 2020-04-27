package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Building {

	public static void main(String[] args) {
		
		Map<Integer, String> floor = new HashMap<>();
		floor.put(1, "Google");
		floor.put(2, "Syntax");
		floor.put(3, "Facebook");
		floor.put(4, "Twitter");
		floor.put(5, "Amazon");
		floor.put(6, "Instagram");
		floor.put(7, "Salesforce");
		
		System.out.println(floor);
		System.out.println("How many elements do I have = "+floor.size());
		
		floor.replace(4, "JPMorgan Chase");//Update the company to the 4th floor
		
		System.out.println(floor);
		floor.remove(7);//Remove 7th floor
		System.out.println(floor); // print the map
		
//		Set<Map.Entry<Integer,String>> values = floor.entrySet();
//		for(Entry<Integer, String> value : values) {
//			System.out.println(value.getKey()+" : "+value.getValue());
//		}
		
		Set<Integer>keys = floor.keySet();
		System.out.println("----getting keys using iterator----");
		Iterator<Integer> keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			int key=keysIt.next();
			//key is 1 and its value is Google
			System.out.println("Key is "+key+" its value is "+floor.get(key));
		}
		System.out.println("-----getting keys using for each loop-----");
		
		for(int k : keys) {
			System.out.println("Key from floor map = "+k+" : "+floor.get(k));
		}
		
		//how to get all values
		
		Iterable <String> values = floor.values();
		
		System.out.println("----getting all values using for each loop-----");
		//map.size();
		
		for(String v : values) {
			System.out.println("Value from collection "+v);
		}
		System.out.println("----getting all values using iterator----");
		
	}
}
