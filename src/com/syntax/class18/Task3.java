package com.syntax.class18;

public class Task3 {
	
//	accessible everywhere public
//	accessible within same package default
//	Accessible within same package protected
//	accessible ONLY within same class private

//	
//	Write a program  that will have 4 different access levels of constructors 
//	and create 3 objects of this class: 
//	1 - inside same class; 2 - from outside the class; 
//	3 - from different class inside different package  and observe result.

	//inside same class
	
	public Task3  (){
		
		System.out.println("Public constructor");
		
	}
	Task3 (int num){
		
		System.out.println("Default constructor");
	}
	protected Task3 (int num, int num1) {
		
		System.out.println("protected constructor");
	}
	private Task3 (String str) {
		
		System.out.println("Private constructor");
	}
	
	public static void main(String[] args) {
		
		
		Task3 obj = new Task3 ();
		Task3 obj1 = new Task3(12);
		Task3 obj2 = new Task3(14,15);
		Task3 obj3 = new Task3("Private");
	
	}
	
}
