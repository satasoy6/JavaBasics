package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is your age?");
		int age=input.nextInt();
		
		if(age>=18) {
			System.out.println("You will be issued a driver's license");
		}else {System.out.println("Would you like to get a learner's permit?");
		
		}
	}

}
