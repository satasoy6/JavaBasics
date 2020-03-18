package com.syntax.class07;

public class Homework {

	public static void main(String[] args) {
		
		//1. Print numbers from 1 to 100 in 1 line with space
		
		int num1 = 1;
		
		while (num1<=100) {
			System.out.print(num1+" ");
//			num1++;
		}
		
//		2.Print numbers from 100 to 1
		int num2 = 101;
 		while(num2>=1) {
 			System.out.println(num2);
 			num2--;
 		}
		
//		3.Print even numbers from 20 to 1 
		int num3 = 1; 
		while (num3<=20) {
			if(num3%2==0)
				System.out.println(num3);
			num3++;
		}
//		3.second way
 		for (int num4=2; num4<=20; num4+=2) {
 			System.out.println(num4);
 		}
		
 //		4.Print odd numbers between 20 and 50 (2 ways)
 		int num5 = 20;
 		while (num5<=50) {
 			if(num5%2!=0)
 		System.out.println(num5);
			num5++;
 		}
//		4.second way
		for (int num6=19; num6<50; num6+=2) {
			System.out.println(num6);
		}
			
		

	}

}
