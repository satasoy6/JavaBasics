package com.syntax.class17;

public class Task1 {
	
//	Create a method that will accept an array as parameters 
//	and will return a sum of all elements from that array. 
//	Method should be visibly only within 
//	same package and accessible by the creating an instance of the class.
	
	
	protected int method (int [] par) {
		
		int sum=0;
		for (int i = 0; i<par.length;i++) {
			
			sum= sum+par[i];
			
		}
		return sum;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Task1 mm = new Task1();
		
		int  [] y = {10,20,30,40};
		
		int array = mm.method(y);
		
		System.out.println("Sum of the array is = "+array);
		
	}
}
