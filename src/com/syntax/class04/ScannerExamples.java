package com.syntax.class04;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		//Capture name from a user and
		//print in the format
		//My name is _____
		
		
		//1.Bring Scanner class into a program
		//System.in-->identifies keyboard
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("What is your name?");
		 String text=scan.nextLine();
		 
		 System.out.println("My name is "+text);
		 
		 System.out.println("How old are you?");
		 int age=scan.nextInt();
		 
		 System.out.println("Your name is "+text+" and your age is "+ age);
	}

}
