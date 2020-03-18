package com.syntax.class08;

public class Recap {
	
	public static void main(String[] args) {
		
		//Print this pattern
		/*1 2 3 4 5 6 7 8 9 10 
		* 2 4 6 8 10 12 14 16 18 20 
		 * 3 6 9 12 15 18 21 24 27 30 
		 * 4 8 12 16 20 24 28 32 36 40 
		 * 5 10 15 20 25 30 35 40 45 50
		 */
		
		for (int i = 1; i<6 ; i++) {
			
			for (int x = 1 ; x<11 ; x++) {
				
				System.out.print((i*x) + " ");
			}
			System.out.println();
		}
	
		 
		
	}
	
	
	
}