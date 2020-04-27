package com.syntax.class27;

import java.util.ArrayList;

public class Drinks {
	
//	Create an arrayList of drinks. 
//	If any drink has letter “a” or “e” replace it with water. 

	public static void main(String[] args) {
		
		ArrayList<String> drink = new ArrayList<>();
		
		drink.add("Maden Suyu");
		drink.add("Salgam");
		drink.add("Su");
		drink.add("Ayran");
		drink.add("Sut");
		drink.add("uzum suyu");
		drink.add("Salgam");
		drink.add("Ayran");
//		for(int i = 0 ; i <drink.size();i++) {
//			if(drink.get(i).contains("a") || drink.get(i).contains("e")) {
//				drink.set(i, "water");//to exchange
//			}System.out.println(drink.get(i));
//		}
//		System.out.println("Biz adami tersten yazdiririz");
//		for( int i = drink.size()-1;i >=0;i--) {
//			System.out.println(drink.get(i));
//		}
		
		// we want to remove all milk and tea String objects
		
		System.out.println(drink);
		for (int i = 0; i<drink.size();i++) {
			
			if(drink.equals("Salgam") || drink.equals("Ayran")){
				drink.remove(i);
				
			}
		}System.out.println(drink);
		
		
	}
}
