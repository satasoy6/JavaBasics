package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arrayList of words. 
//Remove every word that 
//ends with “e”. Use iterator

public class Task2 {
	
	public static void main(String[] args) {
		
		
		ArrayList <String> words = new ArrayList<>();
		words.add("apple");
		words.add("banana");
		words.add("lemon");
		
		System.out.println(words);
		
		System.out.println("Remove words that ends with 'e'");
		
		Iterator <String> it = words.iterator();
		while(it.hasNext()) {
			if(it.next().endsWith("e")) {
				it.remove();
			}
		}
		System.out.println(words);
	}

}
