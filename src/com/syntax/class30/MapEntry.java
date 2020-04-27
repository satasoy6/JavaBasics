package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		
		//create a map that will store month and days in a month
		//We want to make sure we want to keep the order
		Map<String,Integer> month = new LinkedHashMap<>();
		month.put("January", 31);
		month.put("February", 28);
		month.put("March", 31);
		month.put("April", 30);
		
		System.out.println(month.size()); // it gives number of entries
		
		//get all entries from the map
		Set<Entry<String, Integer>>entries = month.entrySet();//we will collect all entry objects
		
		//Loop through all entry objects
		for(Entry<String, Integer> e :entries) { // We can use for(Entry e : entries) but it may cause some problems later
			System.out.println(e.getKey()+" : "+e.getValue());
		}
//		for(Entry<String, Integer> e:m.entrySet()) {
//			System.out.println("month "+e.getKey()+" has "+e.getValue()+" days");
//		} this does it without setting
		
		//iterate through all entry objects
		Iterator<Entry<String, Integer>> it = entries.iterator();
		while(it.hasNext()) {
//			System.out.println("Key "+it.next().getKey()+" value = "+it.next().getValue());
			Entry <String, Integer> entry = it.next();
			System.out.println(entry.getKey()+"=="+entry.getValue());
			
		}
	}
}
