package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		
		
		//Declare a number and compare if number is larger than 100
		//If number is larger than 100 --> my numbr is large
		
		System.out.println("Starting coding");
		
		
		int num=178;
		 if (num>1000) {
			 System.out.println("My number is large");
		 }
		 System.out.println("End of the program");
		 
		 System.out.println("-------------------------");
		 
		 int expectedHours=15;
		 int actualHours=4;
		 
		//if actual is more than expected --> you will love java.
		 
		 if(actualHours>=15) {
			 System.out.println("You will love Java");
		 }else System.out.println("You will hate Java");
		 
		 System.out.println("-------------------------");
		 
		 double budget=100000;
		 double carPrice=120000;
		 
		 //using if we are doing a verification and selective execution
		 if(budget>carPrice) {System.out.println("I will buy this car today");
		 System.out.println("I will be happy");
		 }else {
			 System.out.println("I will not buy this car today "+"I will be happy");
		System.out.println("I will be motivated");
		 }
		 System.out.println("I am code after if condition");
		
		}
		
	}


