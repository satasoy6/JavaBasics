package com.syntax.class07;

import java.util.Scanner;

public class LoopsTask {
	public static void main(String[] args) {
		
// 1.Print numbers from 1 to 50 except those that are divisible by 3
		
	for (int i = 1; i<=50; i++) {
//			
//			if (i%3==0) {
//				continue;
//			}System.out.println(i);
//		}
			
/*Create a program that will be asking user to apply for a credit card 10 times.
 * 	 As soon you get an “yes” from a user program should stop asking.
 */
		Scanner scan = new Scanner(System.in);
//		String answer;
		for (int c= 1; c<=10;c++) {
//			
//			System.out.println("Do you want to apply to a credit card?");
//			answer = scan.nextLine();
//			if (answer.equals("yes"))
//				break;
//		}		
			
		
		
		
		
		int oddsSum=0;
		int evensSum=0;
		int z;
		
		System.out.println("enter two numbers to create a range of numbers");
		System.out.println("Number 1:");
		int num1= scan.nextInt();
		System.out.println("Number 2:"); 		int num2= scan.nextInt();
 		System.out.println("Your range of numbers are "+num1+" and "+num2);
  		
 		for ( z=num1;z<=num2; z++){
		
 		 if(z%2==0){
		evensSum=evensSum+z;
		System.out.println("Evens sum is  ="+evensSum);
 		evensSum=scan.nextInt();	 
 		 	
 		 	
 		}else {
 			System.out.println("Odds sum is ="+oddsSum);
		}
		
		


		
 		}
	
	}

}
	}
}