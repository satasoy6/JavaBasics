package com.syntax.class15;

public class Task {

	
	void larger (int a , int b) {
		
		//method that accepts a parameter
		
		int largest=0;
		if (a>b) {
			System.out.println("number "+a+" is larger than number "+b);
		}else if(b>a){
			System.out.println("number "+b+" is larger than number "+a);
		}else {
			System.out.println("Numbers are equal");
		}
	}
	
	//this is argument style method
	void isItRaining(boolean isRain) {
		if (isRain) {
			System.out.println("Stay home");
		}else {
			System.out.println("Go outside");
		}
		
	}
	
	//this is also argument type method
	
	int evenOrOdd(int a) {
		
		if (a%2==0) {
			
			System.out.println("Number "+a+" is even");
		}else {
			
			System.out.println("Number "+a+" is odd");
		}
			return evenOrOdd(0);
	}
	
	void palindrome(String word) {
		
		char [] array = word.toCharArray();
		String reverse = "";
		
		for (int i = array.length-1; i>=0; i--) {
			
			reverse +=array[i];
		}
		if (reverse.equalsIgnoreCase(word)) {
			System.out.println("Word is palindrome");
		}else {
			System.out.println("Word is not palindrome");
		}
	}
void language (String country) {
		
		switch(country.toLowerCase()) {
		case "usa":
			System.out.println("Hello");
			break;
		case "turkey":
			System.out.println("Merhaba");
			break;
		case "russia":
			System.out.println("Privet");
			break;
		case "mexico":
			System.out.println("Hola");
			break;
			default:
			System.out.println("wrong language");
		}
		
}

		public static void main(String[] args) {
			
			Task obj = new Task ();
			
			obj.isItRaining(true);
			obj.isItRaining(false);
			
			obj.evenOrOdd(43);
			obj.evenOrOdd(12);
			
			obj.larger(44, 32);
			
			obj.palindrome("kayak");
			
			obj.language("turkey");
			
			
		}
}
