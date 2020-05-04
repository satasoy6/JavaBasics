package com.syntax.class33;

public class InfoAboutException {

	public static void main(String[] args) {
		
		String str="Hello";
		
		try {
			char character=str.charAt(10);// new StringIndexOutOfBoundsException
			System.out.println(character);
		}
		catch (StringIndexOutOfBoundsException sobe) {
			//to get info about the exception
			//sobe.printStackTrace();//name, message about the E, where it occurs
			//System.out.println(sobe);// name, message about the E
			System.out.println(sobe.getMessage());
		}
		System.out.println("End of the program");
	}
}
