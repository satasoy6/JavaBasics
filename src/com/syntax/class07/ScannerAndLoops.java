package com.syntax.class07;
import java.util.Scanner;

public class ScannerAndLoops {
	
	public static void main(String[] args) {
		
		//We want to ask user's name and print Good Afternoon____;
		Scanner scan;
		int number;
		int luckyNumber=17;
		scan=new Scanner (System.in);
		
		
		do {
			System.out.println("Please enter any number from 1 to 20");
			number = scan.nextInt();
			
		}while (number!=luckyNumber);//we dont need inc or decrement.
		//we dont know how many times user will enter until the right number
		System.out.println("You got it!!!");
		
		
		
		 }
}
		
		
		
		
		
		
		
		
		
		
			
	

