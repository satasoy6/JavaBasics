package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is the amount of loan is needed?");
		int loan=input.nextInt();
		
		if (loan<=200000) {
			System.out.println("Your loan is approved");
		}else System.out.println();
		
		
		

	}

}
