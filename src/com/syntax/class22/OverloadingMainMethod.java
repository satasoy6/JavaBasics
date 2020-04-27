package com.syntax.class22;

public class OverloadingMainMethod {

	public static void main(int[] args) {
		System.out.println("Method with int array of arguments");	
	}
	public static void main(String args) {
		System.out.println("Method with string argument");
	}
	public static void main(String args, String args1) {
		System.out.println("Method with strings");
	}
	public static void main(String[] args) {//Java always looks for this main method with this signature
		
		System.out.println("Method with string array of arguments");
		OverloadingMainMethod.main("str");
		main("str");
		main ("hello","hi");
		main(new int[2]);
	
//	@here I see some of you didn't understand the benefits of method overloading.
//	It gives FLEXIBILITY, CLARITY, AND INTUITIVENESS to our codes.
//	Think of: System.out.println(); using this method, 
//	you can print String, int, double, boolean etc..
//	Do you call different sysout to print all these datatypes? 
//	NO, you type only one sysout and it can print all data types.
//	Internally corresponding method will be called but 
//	here where int the class that you type sysout, one sysout can print all.
}
}
