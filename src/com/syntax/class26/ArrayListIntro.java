package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>numbers = new ArrayList<>();
		numbers.add(10); //autoboxing happens
		numbers.add(20);
		numbers.add(20);
		numbers.add(30);
		
		System.out.println(numbers.get(2));
		
		System.out.println(numbers.contains(30));
		
		for (int i = 0; i<numbers.size(); i ++) {
			int num = numbers.get(i); // autounboxing happens
			System.out.println(num);
		}
		System.out.println("---------WITH ADVANCED LOOP---------");
		
		for(Integer num : numbers) {
			System.out.println(num);
		}
	}
	
	
}
