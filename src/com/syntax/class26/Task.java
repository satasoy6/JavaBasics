package com.syntax.class26;

import java.util.ArrayList;

public class Task {
	
//	Create a generic ArrayList that will store 5 names into it. 
//	Find out whether the given ArrayList is empty or not? 
//	Check whether the specific name is present in an ArrayList or not?
//	Find the size of your arrayList and print all values from that

	public static void main(String[] args) {
		
		ArrayList<String>names = new ArrayList<>();
		names.add("Seyma");
		names.add("Reyhan");
		names.add("Tugba");
		names.add("Ahmet");
		names.add("Ali");
		
		System.out.println(names.isEmpty());
		
		System.out.println(names.contains("Tugba"));
		System.out.println(names.contains("Ayse"));
		
		System.out.println(names.size());
		
		for (String name :names) {
			System.out.println(name);
		}
		
	}
}
