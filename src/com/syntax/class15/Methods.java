package com.syntax.class15;

public class Methods {
	
	void sayWelcome() {
		
		for (int i = 0; i<10 ; i++) {
			System.out.println("Welcome");
		}
	}
	
	//create method that will say any word # of times
	void sayAnything (String word , int times) {
		
		for (int i = 1 ; i<=times ; i++) {
			System.out.println(word);
		}
	}

	void isItRaining(boolean isRain) {
		if (isRain) {
			System.out.println("Stay home");
		}else {
			System.out.println("Go outside");
		}
		
	}
}
