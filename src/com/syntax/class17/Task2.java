package com.syntax.class17;

public class Task2 {
	
	
//	Create a method that will take a String as a parameter and returns reverse String.
//	Method should be available to all classes within your projects and accessible 
//	by class name.
	
	
	protected String method (String a) {
		
		String reverse = "";
		
		
		for (int i = a.length()-1; i>=0 ; i--) {
			
			reverse = reverse+ a.charAt(i);
		}
		return reverse;
	}
	
	
	public static void main(String[] args) {
		
		Task2 mm = new Task2 ();
		
		String rev = mm.method("Everything will be allright");
		
		System.out.println(rev);
		
		
		
		
	}
}
