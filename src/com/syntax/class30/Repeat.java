package com.syntax.class30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeat {

	public static void main(String[] args) {
		
		Map<String,Integer> month = new LinkedHashMap<>();
		month.put("January", 31);
		month.put("February", 28);
		month.put("March", 31);
		month.put("April", 30);
		
		
		Set<Entry<String, Integer>>entries = month.entrySet();
		for(Entry<String,Integer> e:entries) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
