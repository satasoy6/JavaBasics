package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRecap {

	
	public static void main(String[] args) {
		
		Map<String,String> hmap = new HashMap<>();
		hmap.put("USA", "Washington Dc");
		hmap.put("Russia", "Moscow");
		hmap.put("France", "Paris");
		hmap.put("Tajikistan", "Dushanbe");
		hmap.put("Italy", null);
		hmap.put(null, "some value");
		hmap.put(null, "another value");
		System.out.println(hmap);
		
		//how to get all keys from a map?keySet(), entrySet();
		
		Set<String>set = hmap.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Set<Entry<String,String>> entries = hmap.entrySet();
		Iterator<Entry<String,String>> iter = entries.iterator();
		//let's get both key and value
		while(iter.hasNext()) {
			Entry<String,String>entry  = iter.next();
			String myEntry = entry.getKey().toUpperCase()+" "+entry.getValue().toLowerCase();
			System.out.println(myEntry);
		}
		System.out.println("------Values using values() method------");
		//how to get only values from a map? values();, entrySet();
		Collection<String>values = hmap.values();
		it=values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//let's create hashtable of countries with capitals
		
		Map<String,String> htable =new Hashtable<>();
		
		htable.put("USA", "Washington Dc");
		htable.put("Russia", "Moscow");
		htable.put("France", "Paris");
		htable.put("Tajikistan", "Dushanbe");
//		htable.put("Italy", null);//We can't store null values inside hashtable
//		htable.put(null, "some value");//We can't store null keys inside hashtable either
	}
}
