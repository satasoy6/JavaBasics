package com.syntax.class04;

import java.util.Scanner;

public class ScannerAndVerifications {

	public static void main(String[] args) {
		/*Capture 2 numbers from a user
		 * Compare numbers and identify which is larger
		 */
      Scanner input=new Scanner(System.in);
      System.out.println("Please enter first number");
      
       int number=input.nextInt();
       
       System.out.println("Please enter the second number");
       
       int number2=input.nextInt();
       
       if (number>number2) {
    	   System.out.println(number+" is larger than "+number2);
       }else if (number2>number) {
    	   System.out.println(number2+" is larger than "+number);
       }else {System.out.println(number+" and "+number2+" are equal");
       
       }
		
		}
		
		
	}

