package com.syntax.class05;

public class MoreLogicalOperators {
	public static void main(String[] args) {
		/*We have total 7 days in  a week
		 * if day is 2 or 3-->SDLC class
		 * if day is 6-7-->Java class
		 * if day 1-5 --> off day
		 * if day is 4 --> review class
		 */
		int day=3;
		
		if(day==2&&day==3) {
			System.out.println("SDLC class");
		}else if (day==6&&day==7) {
			System.out.println("Java Class");
		}else if (day==1&&day==5) {
			System.out.println("No class Day off");
		}else if(day==4) {
			System.out.println("Review class");
		}else {
			System.out.println("Invalid day");
		}
		
		System.out.println("---------using strings---------");
		
		//to compare string we use equals
		String day1="Saturday";
		if(day1.equals("Tuesday")||day1.equals("Wednesday")) {//false+false=false
			System.out.println("Today is SDLC class");
			
		}else if (day1.equals("Saturday")||day1.equals("Sunday")) {//true+false=true
			System.out.println("Java Class");
		}
		
	}

}
