package com.syntax.class19;


//Write program as a Student class   that has instance variables 
//name and address. Create a constructor 
//that will initialize those variables.
//Print name & address of given  student using displayInfo method.


public class Student{
	
	String name;
	String address;
	
	Student(){
		
		name = "Selin";
		address = "123 Main ave";
	}
	
	public void displayInfo() {
		
		System.out.println("Student's name is = "+(this.name));
		System.out.println("Student's address is = "+(this.address));
	}
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.displayInfo();
		
	}
}
