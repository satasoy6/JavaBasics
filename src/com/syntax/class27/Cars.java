package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
	
	public static void main(String[] args) {
		
		ArrayList <Object> vehicles = new ArrayList<>();
		vehicles.add("Ford");
		vehicles.add("Red");
		vehicles.add(2013);
		vehicles.add(14000.0);
		vehicles.add('S');
		
		
		//1.Regular for loop
		for(int i = 0 ; i< vehicles.size(); i++) {
			System.out.println(vehicles.get(i));
		}
		System.out.println("******Advanced loop*******");
		//2.Advanced for loop
		for(Object obj : vehicles) {
			System.out.println(obj);
		}
		System.out.println("*********Iterator*******");
		
		Iterator vehicle = vehicles.iterator();
		while(vehicle.hasNext()) {
			System.out.println(vehicle.next());
		}
	}
}
