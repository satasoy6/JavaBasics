package com.syntax.class15;

public class LargestMethod {
	
//	Create a method that will take 2 parameters as a numbers and prints which number is larger.
//	Create a method that will take a number and prints whether the number is even or odd.
//	Create a method that will print whether given String is palindrome or not.
//	Create a method that will say Hello in different language based on the country that will passed when method is executed. 

	
	void  compare (int a , int b) {
		
		if (a>b && a!=b) {
			System.out.println(a +" is larger than "+b);
		
		}else if (b>a && b!=a){
			System.out.println(b + " is larger than "+a);
		
		}else {
			System.out.println(a+ " is equal to "+b);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		LargestMethod compare = new LargestMethod ();
		
		compare.compare(12, 12);
		
		
		
		
	}
}
