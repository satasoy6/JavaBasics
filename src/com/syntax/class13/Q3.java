package com.syntax.class13;

public class Q3 {
	
//	Write a Java Program to print first 10 numbers of Fibonacci series.

	
	public static void main(String[] args) {
		
		int a,b,c;
		
		a=0;
		b=1;
		
		for (int i =1; i<=10; i++) {
			System.out.print(a+" ");
			c =a+b;
			a=b;
			b=c;
			
			//if you want it to start from 1, you will syso c
			
		}
				
	}
}
