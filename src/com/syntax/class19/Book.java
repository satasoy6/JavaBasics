package com.syntax.class19;

public class Book {
	
//	Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
//		Instance variables are being initialized
//		Both Constructors are being executed
	
	
	
	Book (){
		System.out.println("Dale Carneige");
		
	}
	Book (String x){
		this ();
		System.out.println("Paulo Chello");
		
	}
	public static void main(String[] args) {
		
		Book obj = new Book ("Authors");
	}

}
