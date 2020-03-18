package com.syntax.class05;

import java.util.Scanner;

public class CompareTwoNumberUsingNestedIf {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your first number");
		
		int num1=input.nextInt();
		
		System.out.println("Enter your second number");
		int num2=input.nextInt();
		
		System.out.println("Enter your third number");
		int num3=input.nextInt();
		
		int largest;
		
		if(num1>num2) {//here num1 is already larger than num2
			              if(num1>num3) {
				          largest=num1;
			              }else {
				          largest=num3;
			              }
		}else {//(num2>num1)
			if(num2>num3) {//num2 is larger than num1 and num2 is>num3
				largest=num2;
			}else {
				largest=num3;
			}
		}System.out.println("The largest number is "+largest);
	}

}
