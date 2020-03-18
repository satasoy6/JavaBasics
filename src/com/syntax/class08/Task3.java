package com.syntax.class08;

public class Task3 {

	public static void main(String[] args) {
		
		
		//Create an array of countries. 
		//While retrieving all values from 
		//an array print capital for each country. 
		//(use 2 different loops).
		
		String [] countries = {"USA","Poland","Ukraine","Turkey","Spain"};
		
		for (String i:countries) {
			if (i.equals("USA")) {
				System.out.println("The capital of "+i+" is Washington DC.");
			}else if (i.equals("Poland")) {
				System.out.println("The capital of "+i+" is Warsaw.");
			}else if (i.equals("Ukraine")) {
				System.out.println("The capital of "+i+" is Kiev.");
			}else if (i.equals("Turkey")) {
				System.out.println("The capital of "+i+" is Ankara.");
				
			}else if (i.equals("Spain")) {
				System.out.println("The capital of "+i+" is Madrid.");
			}
		}

		System.out.println("---------2nd method--------");
		for (int y = 0;y<countries.length;y++) {
			
			switch(countries[y]) {
			
			case "USA":
				System.out.println("The capital is Washington DC.");
				break;
			case "Poland":
				System.out.println("The capital is Warsaw.");
				break;
			case "Ukraine":
				System.out.println("The capital is Kiev.");
				break;
			case "Turkey":
				System.out.println("The capital is Ankara.");
				break;
			case "Spain":
				System.out.println("The capital is Madrid.");
				break;
				default:
					
			}
		}
			
		
		
	}

}
