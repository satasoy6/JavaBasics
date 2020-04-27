package com.syntax.class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW4 {

	
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		set.add("Becoming");
		set.add("a tester");
		set.add("requires ->");
		set.add("dedication");
		set.add("hard work");
		set.add("commitment");
		set.add("disipline.");
		set.add("Believe in");
		set.add("yourself!");
		set.add("You");
		set.add("can");
		set.add("do it!");
		set.add("disipline.");
			
		for(String concat : set) {
			System.out.print(concat+ " ");
		}
		
	}
}
