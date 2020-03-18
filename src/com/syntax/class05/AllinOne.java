package com.syntax.class05;

import java.util.Scanner;

public class AllinOne {
	
	public static void main(String[]args) {
		
		/*Write a program to ask user if there is a sale
		 * if no sale-->not going shopping
		 * if sale we will ask the price of the item
		 * based on the price we will apply discount and calculate the final price
		 * 
		 */
		
		/*if price less than 20 -->10%
		 * if price between 20 and 100-->apply 20%
		 * if price between 100 and 500-->apply30%
		 * if price more than 500-->apply 50%
		 * 
		 * After discount___the price of the item reduced from __ to __.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		double discount = 0;
		System.out.println("Is there a sale?");
		String sale=scan.nextLine();
		
		if(sale.equalsIgnoreCase("yes") ){
		
		System.out.println("Enter the price");
		double price=scan.nextDouble();
		if(price<20) 
			discount=0.10;
		else if(price>=20 && price<100) 
			discount=0.20;
		else if(price>=100 && price<500) 
			discount=0.30;
		else if (price>500)
			discount=0.50;
		
		System.out.println("After discount "+discount+" the price of the item reduced from "+price+" to "+(price-(price*discount)));
		
		
		}else 
			System.out.println("Don't go to shopping");
		
		
		
	}
		}

