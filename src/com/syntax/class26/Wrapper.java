package com.syntax.class26;

public class Wrapper {

	public static void main(String[] args) {
		
	//Autoboxing
	Integer	num = 10;//this value is not presented by an primitive data type anymore.
	
	String s = num.toString();
	
	System.out.println(num.MIN_VALUE);
	
	Byte b =90;
	System.out.println(b.MIN_VALUE);
	System.out.println(b.MAX_VALUE);
	String s1 = b.toString();
	System.out.println(s1);
	
	Boolean bool = true;
	//autounboxing
	boolean b1 = bool;
	
		
	}
}
