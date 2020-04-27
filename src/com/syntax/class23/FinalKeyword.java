package com.syntax.class23;

public class FinalKeyword {
	
	public static String str = "Hello";
	public static final String str1 = "Bye";//final variable

	static final char GRADE = 'A';
	
	public static void main(String[] args) {
		
		str="hi";
		FinalKeyword fk = new FinalKeyword ();
		fk.hello();
		
	}
	public final void hello() {
		System.out.println("I am a final method");
	}
}
class SubClass extends FinalKeyword{
	
	public final void hello(String a) {
		
	}
}
