package com.Seyma.calismalari;

import java.util.Scanner;

public class FindPrimeNumber {
	
	public static void main(String[] args) {
		
		//Write a java program to check whether a given number is prime or not?
		
		
		Scanner scan = new Scanner (System.in);
		
		
		
		
		System.out.println("Enter a number");
		
		int number = scan.nextInt();
		
		if (isPrime(number)) {
			
			System.out.println(number+" is a prime number");
		}else {
			System.out.println(number + " is not a prime number");
		}
		
	
		
	}

	private static boolean isPrime(int number) {
		
		if (number <=1) {
			return false;
		}
		
		for (int i = 2; i<Math.sqrt(number); i++) {
			
			if (number%i==0) {
				
				return false;
			}
		}
		return true; 
	}
	

}
