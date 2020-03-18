package com.syntax.class06;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char grade;
		String explanation;
		System.out.println("Please enter your grade");
		grade= scan.next().charAt(0);
		
		switch(grade) {
		
		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Need work";
			break;
			default:
				explanation = "Not acceptable";
				
			
		}System.out.println("You entered "+grade+" and your score is "+explanation);
		
	}

}
