package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arraylist of cars 
//and retrieve all the values 
//using 3 different ways.

public class Task {
	
	public static void main(String[] args) {
		
		ArrayList <String> cars = new ArrayList<>();
		
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Ford");
		cars.add("Chevy");
		
		System.out.println(cars);
		
		System.out.println("*********using enhanced for loop*************");
		
		for (String c : cars) {
			System.out.println(c);
		}
		System.out.println("*********using regular for loop*************");
		
		for (int i = 0; i<cars.size();i++) {
			String str = cars.get(i);
			System.out.println(str);
		}
		System.out.println("***********using iterator**********");
		Iterator <String> iterator = cars.iterator();
		while(iterator.hasNext()) {
			String s =iterator.next();
			System.out.println(s);
		}
		
	}

}
