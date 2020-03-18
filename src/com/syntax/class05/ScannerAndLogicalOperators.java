package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {
	public static void main(String[] args) {
		
		
		/*Take age input from a user and then based on the age print output
		 * if age from 0-3--> you are a baby
		 * if age is 4-5-->you are a kid
		 * if age 6-12-->you are a child
		 * if age 13-19-->you are a teenager
		 * if age 20-64-->you are an adult
		 * if age is more or equal to 65-->you are a senior 
		 */
		
		//1-let's declare all variables
		
		Scanner age1=new Scanner(System.in);
		System.out.println("Please enter age");
		
		int age=age1.nextInt();
		
		if(age>=0&&age<3) {
			System.out.println("You are a baby");
		}
		if(age>=3&&age<5) {
			System.out.println("You are a kid");
		}
		if(age>6&&age<12) {
			System.out.println("You are a child");
		}
		if(age>13&&age<19) {
			System.out.println("you are a teenager");
		}
		if(age>=20&&age<64) {
			System.out.println("You are an adult");
		}
		if(age>64) {
			System.out.println("You are a senior");
		}
	}

	}
