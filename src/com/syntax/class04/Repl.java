package com.syntax.class04;

import java.util.Scanner;

public class Repl {
	public static void main(String[]args) {

		  
	
		    
		    
				
				Scanner scan = new Scanner (System.in);
				
				System.out.println("Please enter two strings");
				
				
				String word1 = scan.nextLine();
				
				String word2 = scan.nextLine();
				
				System.out.println("Please enter two numbers");
				
				int int1 = scan.nextInt();
				
				int int2 = scan.nextInt();
				
				if(int1==int2 && word1.equals(word2)) 
					System.out.println("AND");
				else if(int1==int2 || word1.equals(word2))
							System.out.println("OR");
					
				else if (int1!=int2 && word1!=word2)
					System.out.println("NONE");
	else 
		System.out.println("");
				
					
				
				
			
		    
		  


		
	}
}
	    
	    
	    
	  




