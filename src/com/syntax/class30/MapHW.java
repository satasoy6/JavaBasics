package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapHW {

	public static void main(String[] args) {
		
		Map<Integer, String> building=new LinkedHashMap<>();
		//Entries with duplicate keys and values;
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Google");
		building.put(4, "Amazon");
		building.put(4, "Amazon");
		building.put(5, "HP");
		building.put(6, "Microsoft");
		building.put(7, "Oracle");
		
		System.out.println(building.size());
		System.out.println(building);
		
		//HOW TO GET ALL THE KEYS
		
		Set<Integer> keys=building.keySet();//to get all values one by one we get it with iterator
		System.out.println( );
		
		
		System.out.println("------------------Getting keys using iterator------------------");
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {//is there next element ?
			Integer key = it.next();//yes there is a next element.
			//key is ___ and its value is__ (how to get both of these)
			System.out.println("Key is " +key+" and value is "+building.get(key));//this gives key and value	
			//System.out.println(key); this is to get only key
		}
		System.out.println("------------------Getting keys using for each loop------------------");
		for(int k:keys) {
			//which collection stores all of my keys -my set collection
			System.out.println("Key from building map "+k+" and the value is "+building.get(k));
		}
		
		//how to get all values
		
		Collection<String> values = building.values();//Iterable=collection but Iterable has only iterator method
		// that is not convenient for us
		System.out.println("---------- Getting all values using for each loop ------------");
		 
		//internally advance for loop it has a logic works same as iterator
		for(String v : values) {
			System.out.println("Value from collection  "+v);
		}
		System.out.println("---------Getting all values using iterator--------");
		//Map doesnt have the methods.
		//to retrieve all the values we use method values
		Iterator<String> it2 = values.iterator();
		while(it2.hasNext()) {
			System.out.println("Map value :  "+it2.next());
		}
	}
}