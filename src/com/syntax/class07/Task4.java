package com.syntax.class07;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		
		/*Write a program to ask a user to enter item they want to
		 *  buy and the price of that item. Every time user enters  If user give more money program should return a change. Whenever a user done with payments program should say “Thank you for shopping!”
		 *  money accumulate the amount and tell the user how much is left to pay off the amount.
		 *  
		 *  
		 */
				
		
		
		Scanner scan = new Scanner(System.in);
		
		String item;
		
		double price;
		double money;
		double amount = 0;
		double change;
		double remainingBalance;
		
		System.out.println("what are you buying today");
		item=scan.nextLine();
		
		System.out.println("What is the price for the "+item);
		price= scan.nextDouble();
		
		do {
			System.out.println("Please pay");
			money=scan.nextDouble();
			
			amount= amount +money;
			if (amount<price) {
				remainingBalance=price-amount;
				
			}else if (amount>price) {
				change=amount-price;
			}else {
				System.out.println("Thank you");
			}
		}while (price!=amount) ;{
			
		}
		
		System.out.println("enter what you want to buy");
		item=scan.nextLine();
		
		
		
				
	}

}
