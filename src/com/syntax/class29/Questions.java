package com.syntax.class29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Questions {
	public static void main(String[] args) {
		List <String>aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String> set = new LinkedHashSet<>();
		set.addAll(aList);
		System.out.println(set);
		set.add("Alijon");
		set.add("Usman");
		
		//how to get only 1 value from set?
		//first we can convert to list and inside the list we can use method get.
		
		if (set.contains("Jasmine")) {
			System.out.println("We have Jasmine");
		}
		//1 convert to list	
		List<String> list = new ArrayList<>(set);
		String name = list.get(4);
		System.out.println(name);
		list.add("Jane");
		list.add("Jane");
		list.add("Jane");
		System.out.println(list);
		
		//2 convert to array
		
		Object [] array = set.toArray();//toArray returns array of objects
		System.out.println(array[5]);
		Arrays.sort(array);//Array is a utility class that have methods to work with arrays
		
		//to sort elements of any collection
		//Collections is a utility class that have methods to work with collections
		
		Collections.sort(list);
		System.out.println(list);
	}
}


