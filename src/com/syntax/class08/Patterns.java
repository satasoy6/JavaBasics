package com.syntax.class08;

public class Patterns {

	public static void main(String[] args) {
		
		
		System.out.println("-----Printing Pattern using nested loops-----");
		
		
		for ( int a = 1; a<=4; a++) {
			for (int j = 1; j<=5; j++) {
				System.out.print("*");
			}System.out.println();
				
		}
			
		
		System.out.println("------PATTERN 1 (10X10)-------");
		
		for (int x = 0; x<10 ; x++ ) {
			for (int y = 0; y<10; y++) {
				System.out.print("* ");
			}System.out.println();
		}
		
	
	}

}
