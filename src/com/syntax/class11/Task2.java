package com.syntax.class11;

public class Task2 {

//	Create an array of countries: 
//	north America countries, south 
//	America countries, Europe countries, 
//	Asian countries, African countries. 
//	Then print all values from that array 
//	using 2 different loops and calculate 
//	how many total countries been stored.
	
	
	public static void main(String[] args) {
		
		String [] [] countries = {
				
				{"Canada","USA","Mexico"},
				{"Colombia","Brazil","Paraguay"},
				{"Britain", "Denmark","Holland"},
				{"Phillippines","China","Japan"},
				{"Morocco","Egypt","South Africa","Uganda","Eritrea"}
				};
		
		int total = 0;
		for (int x= 0; x<countries.length; x++) {
			
			for (int y = 0; y<countries[x].length; y++) {
				System.out.println(countries[x][y]+" ");
				total++;
				
			}
			System.out.println();
		}
		
		
		System.out.println("--------Using Advanced For Loop----------");
		
		int count = 0;
		
		for (String [] world : countries) {
			for (String c : world) {
				System.out.println(c+" ");
				count++;
			}
		}
	
		System.out.println("Total "+total);
		System.out.println("Count"+count);
	}
		

	}

