package com.syntax.class12;

public class Task2 {

//	Create a String and if the String is not empty 
//	perform the following: 
//	if the String has an odd number of characters
//	and has 3 or more characters, 
//	print the character in the middle of the String.
	
	public static void main(String[] args) {
		
		String str = "happy";
		if (str.isEmpty()) {
			System.out.println();
			
		}else if (str.length()%2!=0 &&str.length()>=3) {
			System.out.println(str.subSequence(2, 3));
		}
			
		
		
		
	}

}
