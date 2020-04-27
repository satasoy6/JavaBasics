package com.syntax.class19;

public class ThisKeyword {
	
	//I use THIS keyword to access to my instance variables and methods
	//I can not use it in the main method
	//this()always have to be the int the first line of the constructor.
	
	int a,b;
	
	public ThisKeyword() {
		
		System.out.println("I am no argument construction");
	}
	public ThisKeyword(int a, int b) {
		this.a=a;//this.a =100;
		this.b=b;
	}
	
	public void sum(int a, int b) {
		
		//sum of which variables am I calculating?
		System.out.println("Sum of local variables = "+(a+b));
		System.out.println("Sum of instance variables = "+(this.a+this.b));
	}
	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword(10,20);
		obj.sum(100, 200);
		
		System.out.println("-------------------------------------");
		ThisKeyword obj2 = new ThisKeyword ();
		obj2.sum(20, 40);
	}
	

}
