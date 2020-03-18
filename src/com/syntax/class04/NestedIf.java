package com.syntax.class04;

public class NestedIf {

	public static void main(String[]args) {
		
		boolean classToday=true;
		boolean flag=false;
		
		if (flag) {
			System.out.println("Hello");
			
			if (classToday) {
				System.out.println("Hello friends");
			}else {System.out.println("Hello family");
			
			}
			
		}else {System.out.println("Bye");
		
	}
		System.out.println("I am outside of if condition");
		
}
	/*Lets say you are in the doctor and there is a list you need to fill out.
	 * asking you if you have an allergy. When you click yes it is going to ask what
	 * kind of allergy you have. if you dont have one it s never asking for the types.
	 */
    

}