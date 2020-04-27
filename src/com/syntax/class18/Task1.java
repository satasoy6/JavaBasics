package com.syntax.class18;

public class Task1 {
	
	//Write a program that will have a constructor; one with parameters
	//second one without any parameters.Create a separate test class 
	//with both of the constructors

	
	String parameters;
	
	public Task1() {
		
		System.out.println("I am the first constructor without the parameters");
	}
	public Task1(String x) {
		
		parameters = x;
		System.out.println("I am a second constructor with parameters");
	}
	public static void main(String[] args) {
		
		Task1 obj1 = new Task1();
		Task1 obj = new Task1("Hello World");
		
	}
	
	
}
