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

	}

}
