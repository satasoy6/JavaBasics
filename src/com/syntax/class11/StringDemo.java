package com.syntax.class11;

public class StringDemo {
	
	public static void main(String[] args) {
		
		
		String school = " Syntax ";
		
		String str = new String ("HELLO");
		
		String str1 = "This is a string dada3429ueui";
		
		
		//how many characters a string has
		
		System.out.println(school.length());
		
		int size =str.length();
		System.out.println("String length is "+size);
		
		//convert string to lower case or upper case
		school.toUpperCase();
		
		System.out.println(school.toUpperCase());
		
		str.toLowerCase();
		
		System.out.println(str.toLowerCase());
		str = str.toLowerCase(); 
		System.out.println(str);
		
		//concatinate 2 Strings
		
		System.out.println("-------Concat function-------");
		String newString = str+school;
		System.out.println(newString);
		
		
	}

}
