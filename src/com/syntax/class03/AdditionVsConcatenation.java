package com.syntax.class03;

public class AdditionVsConcatenation {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String x="Hello";
		String y="Bye";
		
		System.out.println(a+b+x+y);
		System.out.println(a+x+b+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println(a+""+b);
		
		//any number comes after a string will be printed as it is.
		//Any number before the string will be addition
		//if you want an addition after a string, use parenthesis
		//if you want to show first numbers before string (a+""+b)
		//this is needed.
	

	}

}
