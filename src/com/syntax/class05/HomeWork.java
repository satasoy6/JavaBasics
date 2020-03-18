package com.syntax.class05;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner score=new Scanner(System.in);
		System.out.println("Enter your quiz score");
		int quiz=score.nextInt();
		System.out.println("Enter your midTerm score");
		int midTerm=score.nextInt();
		
		System.out.println("Enter your final score");
		int finalScore=score.nextInt();
				
		
		double average=(quiz+midTerm+finalScore)/3;
		
		if(average>=90) 
			System.out.println("Your Grade is A");
		if(average>=70&&average<90)
			System.out.println("Your grade is B");
		if(average>=50&&average<70) 
			System.out.println("Your grade is C");
		if(average<50) {
			System.out.println("Your grade is F");
		}
		
	}

}
