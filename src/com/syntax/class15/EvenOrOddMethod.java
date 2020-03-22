package com.syntax.class15;

public class EvenOrOddMethod {
	
//	Create a method that will take a number and prints whether the number is even or odd.
	
	void EvenOrOdd (int a ) {
		
		if (a%2==0) {
			System.out.println(a + " is an even number");
		}else {
			System.out.println(a +" is an odd number");
		}
			
	}

	public static void main(String[] args) {
		
		EvenOrOddMethod number = new EvenOrOddMethod();
		
		number.EvenOrOdd(46);
	}
}
