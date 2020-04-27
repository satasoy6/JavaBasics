package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork4 {

	public static void main(String[] args) {
		// Create an ArrayList of even Numbers 
		//from 1 to 50 uing Iterator remove any numbers divisible 5 
		
		
		
		ArrayList <Integer>numbers= new ArrayList<> ();	
		for(int i = 1; i<=50 ; i++) {
			if(i%2==0) {
				numbers.add(i);
			}
		}System.out.println(numbers);
				
	Iterator < Integer> f  = numbers.iterator();
	while ( f.hasNext()) {
		if ( f.next()%5==0) {
			f.remove();
		}
	}
	System.out.println(numbers);

	for (Integer i:numbers) {
		System.out.println(i);
	}
	}

}
