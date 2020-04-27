package com.syntax.class22;

public class addition {

	public void add (int num1 , int num2) {
		System.out.println(num1+num2);
	}
	public void add (int num1 , int num2, int num3) {
		System.out.println(num1+num2+num3);
}
	public static void main(String[] args) {
		
		addition obj = new addition();
		obj.add(12, 14);
		
		//I already know which method is going to get executed
		//this is static / compile polymorphism
	}
}
