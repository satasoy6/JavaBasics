package com.syntax.class03;

public class CompareNumbers {

	public static void main(String[] args) {
		
		double numberOne=10;
		double numberTwo=10;
		
		if (numberOne<numberTwo) {
			System.out.println("double value"+numberOne+" is larger than "+numberTwo);
		}else if(numberOne>numberTwo) { System.out.println("Double value "+numberOne+"is smaller than "+numberTwo);
			
		}else {
			System.out.println("Numbers are equal");
		}
		
		//declare variable for a day and then based on the value we will provide the output
		
		int day=0;
		if(day==1) {
			System.out.println("It's Monday, no class today");
		}else if (day==2) {System.out.println("It's Tuesday, we have SDLC class");
		
		}else if (day==3) {System.out.println("It's Wednesday, we have SDLC class");
		
		}else if (day==4) {
			System.out.println("It's Thursday, we have a review class");
		}else if (day==5) {
			System.out.println("It's Friday, no class");
		}else if (day==6) {
			System.out.println("It's Saturday, we have Java Class");
		}else if (day==7) {
			System.out.println("It's Sunday we have Java Class");
		}else {
			System.out.println("Invalid weekday");
		}
		}

	}


