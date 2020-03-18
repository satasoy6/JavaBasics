package com.syntax.class12;

public class Task1 {

	//Create a String and print it in reverse order (Sunday → yadnuS).
	public static void main(String[] args) {
		
		String day = "Sunday";
		
		String reverseDay = "";
		for(int i = day.length()-1;i>=0;i--) {
			
			reverseDay=reverseDay+day.charAt(i);
			
		}
		System.out.println("Reverse of sunday is : ");
		System.out.println(reverseDay);
		
		
	}
}
