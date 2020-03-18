package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[]args) {
		
		double d=10;
		System.out.println(d);//10.0
		
		//Casting in Java is a conversion of 1 type into another type
		
		//Primitives and non primitives casting
		
		//type mismatch, cannot convert double to int
		
		//(widening)byte->short->int->long->float->double
		
		
		int i=(int)10.99;
		System.out.println(i);
		
		byte b=(byte)128;
		System.out.println(b);
	}
}
