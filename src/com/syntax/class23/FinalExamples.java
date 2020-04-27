package com.syntax.class23;

public class FinalExamples {

	final String str = "I love Java";
	
	public void saySomething(String str) {
		System.out.println(str);
	}

	public static void main (String [] args) {
		
		FinalExamples obj = new FinalExamples ();
		obj.saySomething("I love Java");
		
		
	}
}
