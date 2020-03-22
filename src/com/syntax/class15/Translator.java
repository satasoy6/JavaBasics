package com.syntax.class15;

public class Translator {
	void language (String greet) {
		
		switch(greet.equalsIgnoreCase(greet)) {
		case "USA":
			System.out.println("Hello");
			break;
		case "Turkey":
			System.out.println("Merhaba");
			break;
		case "Russia":
			System.out.println("Privet");
			break;
		case "Mexico":
			System.out.println("Hola");
			break;
			default:
			System.out.println("wrong language");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
