package com.syntax.class06;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		
		/*Using scanner class create calculator.
    	 *  Allow user to enter 2 numbers and operator(+,-,*,/).
    	 *  Based on operator provide the result to user.
    	 */
		Scanner scan=new Scanner(System.in);
		
		int a;
		int b;
		char operators;
		
		System.out.println("Enter your first number");
		a=scan.nextInt();
		System.out.println("Enter your second number");
		b=scan.nextInt();
		
		System.out.println("Please select your operation: + , - , * , /");
		operators=scan.next().charAt(0);
		switch(operators) {
		
		case '+':
			System.out.println("The result is "+(a+b));
			break;
		case '-':
			System.out.println("The result is "+(a-b));
			break;
		case '*':
			System.out.println("The result is "+(a*b));
			break;
		case '/':
			System.out.println("The result is "+((double)a/b));
			break;
			default:
				System.out.println("Invalid entries");
		}
		

		
	}

}
