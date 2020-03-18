package com.syntax.class12;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {
		
//		Based on the input suggests a name for a baby:
//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? boy
//		Suggested baby name: DANRY
//
//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? girl
//		Suggested baby name: MAIEL
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("What is the name of the mother?");
		String mom = scan.nextLine();
		
		System.out.println("What is the name of the father?");
		String dad = scan.nextLine();
		
		System.out.println("Is it boy or girl?");
		String gender = scan.nextLine();
		
		
		String name="";
		
		if (gender.equals("boy")) {
			
		name=(dad.substring(0, 2)+mom.substring(2,3 ));
			System.out.println(name);	
			
		}
		else 
			name = mom.substring(0, 2)+dad.substring(2,4 );
		System.out.println(name);
				
//		
//		just for a feedback : 
//			instead of giving us half hour to solve a problem,
//			i think it would be more useful to start typing from the beginning 
	}

}
