package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String country;
		String language;
		System.out.println("What is your country?");
		country = scan.next();
		 
		switch(country) {
		
		case "Turkey":
			language = "Turkish";
			break;
		case "USA":
			language = "English";
			break;
		case "Russia":
			language = "Russian";
			break;
		case "Germany":
			language = "German";
			break;
			default:
				language = "unknown";
				
		}System.out.println("The language in "+country+" is "+language);
		
	}

}
