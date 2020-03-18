package com.syntax.class12;

public class StringManipulationsMore {
	
	public static void main(String[] args) {
		
		//to get substring from a given string
		//substring = String inside your string
		
		System.out.println("-------substring()Function-------");
		
		String str = "Today is a rainy day";
		//is a rainy day
		String partialString = str.substring(6);//start from 6 until the end of String
		System.out.println(partialString);
		
		//rainy day
		partialString = str.substring(11);
		System.out.println(partialString);
		
		//today
		partialString = str.substring(0, 5);//start from 0 end at index 5
		System.out.println(partialString);
		
		//rainy
		partialString = str.substring(11, 16);
		System.out.println(partialString);
		
		
	}

}
