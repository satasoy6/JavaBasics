package com.syntax.class06;

import java.util.Scanner;

public class Calculator {
     public static void main(String[]args) {
	
    	/*Using scanner class create calculator.
    	 *  Allow user to enter 2 numbers and operator(+,-,*,/).
    	 *  Based on operator provide the result to user.
    	 */
       Scanner scan = new Scanner(System.in);
      
	
      String operations = "1. Summation\n" // "\n allows me to write line by line without using multiple strings.
    		             +"2. Subtraction\n"
    		             +"3. Multiplication\n"
    		             +"4. Division";
      
      System.out.println(operations);
      
     
      System.out.println("***************************");
      System.out.println("Select your operation");
      String operation = scan.nextLine();
      
      int a;
      int b;
      String firstNumber ,  secondNumber;
      switch(operation) {
      
      case "1":
    	  firstNumber="Enter the first number";
    	  a=scan.nextInt();
    	  secondNumber="Enter the second number";
    	  b=scan.nextInt();
    	  System.out.println("The sum of 2 numbers are "+(a+b));
    	  break;	  
    	  
      case "2":
    	  firstNumber="Enter the first number";
    	  a=scan.nextInt();
    	  secondNumber="Enter the second number";
    	  b=scan.nextInt();
    	  System.out.println("The subtraction of the numbers are "+(a-b));
    	  break;	  
      case "3":
    	  firstNumber="Enter the first number";
    	  a=scan.nextInt();
    	  secondNumber="Enter the second number";
    	  b=scan.nextInt();
    	  System.out.println("The sum of 2 numbers are "+(a*b));
    	  break;	  
    	  
      case "4":
    	  System.out.println("Enter the first number");
    	  a=scan.nextInt();
    	  System.out.println("Enter the second number");
    	  b=scan.nextInt();
    	  System.out.println("The subtraction of the numbers are "+((double)a/b));
    	  break;	  
      default:
    	  System.out.println("Invalid operation");
      }
      
    		  
      
       
     }
}
