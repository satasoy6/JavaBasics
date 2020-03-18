package com.syntax.class03;

public class RelationalEqualityOperators {

	public static void main(String[] args) {
		
		int i= 10;
		int y= 20;
		
		System.out.println(i>y);
		System.out.println(i<y);
		System.out.println(i==y);
		System.out.println(i!=y);
		
		System.out.println("-------------------------------");
		
		double a=900.99;
		double b=100.99;
		
		boolean result, result1, result2;
		
		result=a>b;//true
		
		result1=a==b;//false
		
		result2=a!=b;
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		
		

	}

}
