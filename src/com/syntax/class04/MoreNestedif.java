package com.syntax.class04;

public class MoreNestedif {
	public static void main(String[]args) {
		
		//declare date and a day.
		//if day is friday-->if date is 13th-->watch a scary movie
		//                -->if day is not 13th, we will watch comedy
		
	
	 boolean isFriday=false;
	 int date=14;
	 
	 
	 if(isFriday) {System.out.println("Today is Friday, I am going to a movie");
	 
	 if(date==13) {System.out.println("I will watch a scary movie");
	 
	 }else {System.out.println("I will watch a comedy");
	 
	 }
	 
	 
	 }else {System.out.println("Today is not friday, I am staying home");
	
	
	
	
	}


}
}
