package com.syntax.class13;

public class Q1 {
	
	public static void main(String[] args) {
		
		/*	Write a program to swap 2 numbers without a 
		 * temporary variable? Swap  2 strings without 
		 * a temporary variable?
		 * 
		 * 
		 */
		
		
		int a = 10;
		int b = 20;
		
		a = a+b;//30
		b = a-b;//30-10=20
		a = a-b;
		
		
		
		System.out.println("The value of a ="+a);
		System.out.println("The value of b ="+b);
		
		//Swaping the value of strings
		
		String str1 = "Syntax";
		String str2 = "Technologies";
		
		str1 = str1+str2; // DayNight
		
		System.out.println(str1);
		
		str2 = str1.substring(0, str1.length()-str2.length());
		System.out.println(str2);
		
		str1 = str1.substring(str2.length());// If we write it this way it will work with every word
				System.out.println(str1);

				
				// Another way
				
				String s1 = "Hello";
				String s2 = "Bye";
				
				String shorterstr1 = s1 + s2 ;
				
				s2 = shorterstr1.replace(s2,"");
				s1 = shorterstr1.replace(s1, "");
				
		
		
		
		
		
	}

}
