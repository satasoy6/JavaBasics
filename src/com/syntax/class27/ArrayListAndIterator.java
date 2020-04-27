package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator {
	
	public static void main(String[] args) {
		
		//let's create an ArrayList of chocolate
		ArrayList <String> choco = new ArrayList<>();
		
		choco.add("Kinder");
		choco.add("godiva");
		choco.add("kit kat");
		choco.add("snickers");
		
		//create arraylist of sweets
		
		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheesecake");
		sweets.addAll(choco);
		
		System.out.println(sweets.size());
		System.out.println(sweets);
		
		//to iterate through entire collection
		//iterator loops only one direction!!!!!!!!!!
		System.out.println("----------ITERATOR---------");
		Iterator <String> it = sweets.iterator();
		while (it.hasNext()) {//while iterator has the next element, print
			String element = it.next();
			if(element.equals("ice cream")) {
				it.remove();
			}
		}
		System.out.println("Array list after removing ice cream");
		System.out.println(sweets);
		
		System.out.println("--------REGULAR FOR LOOP-----");
		for (int i = sweets.size()-1;i>0;i--) {
			System.out.println(sweets.get(i)+" ");
		}
		
		System.out.println("----------ADVANCED LOOP---------");//STARTS from the beginning of the collection
		for(String str:sweets) {								//and also always iterates through one direction
			System.out.println(str);
		}
	}

}
