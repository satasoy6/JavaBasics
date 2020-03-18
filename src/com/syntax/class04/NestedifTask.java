package com.syntax.class04;

public class NestedifTask {
	public static void main(String[]args) {
		
		boolean hasDiploma=true;
		
		double gpa=3.5;
		
		if(hasDiploma) {
			System.out.println("Congratulations");
			if(gpa>=3.5) {
				System.out.println("You are eligible for a scholarship");
			}else if(gpa<3.5) {
				System.out.println("You should have studied harder");
			}
			
		}else {
			System.out.println("You should get a degree");
		}
		
		
	}

}
