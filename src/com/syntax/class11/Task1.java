package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		
		
//		Create an array of cars : 
//		american, german, korean, italian.
//		Then retrieve all values from 
//		that array using 2 different loops
		
		String [] [] cars = {
				{"Chevrolet","Ford","Lincoln"},
				
				{"Mercedes","BMW"},
				{"Hyundai","Kia"},
				{"Ferrari","Alfa Romeo"},
		};
		
		for (String [] brand:cars) {
			for (String model:brand) {
				System.out.println(model+" ");
			}System.out.println();
		}
		
		

	}

}
