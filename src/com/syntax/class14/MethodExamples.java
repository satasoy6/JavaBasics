package com.syntax.class14;

public class MethodExamples {
	
	// I want to create a method that will be greeting a person
	
	String name;
	String object1;

	void greet() {
		System.out.println("Hello Sarmed");
	}
	void greet1 (String name) {
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
		
		//how do i call method greet
		
		//className variableName = new ClassName();
	MethodExamples object1 = new MethodExamples ();
	
	
	
	object1.greet();
	object1.greet1("Seyma");
	object1.greet1("John");
	object1.greet1("Faisal");	
	object1.greet1("Josh");
	object1.greet();
	//object1.greet1('c');//Compiler error
	
	
}
}
