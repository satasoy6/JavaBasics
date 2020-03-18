package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		Scanner scan = null;
		String famousFood = null ;
		String country;
		
		Scanner food = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = scan.nextLine();
				
		
		switch (famousFood) {
		
		case "morocco":
		    famousFood = "Couscous";
		    break;
		case    "belarus":
			famousFood = "Potato";
			break;
		case "tajikistan":
			famousFood = "Osh";
			break;
		case "turkey":
			famousFood = "Baklava";
			break;
		case "Afghanistan":
			famousFood = "Mantu";
			break;
			default:
			famousFood = "Invalid";
		}
		
		
	}
}
