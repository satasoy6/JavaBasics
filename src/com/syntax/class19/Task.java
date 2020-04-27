package com.syntax.class19;

public class Task{
//	
//	Write program as a Student class   that has instance variables name and address. 
//	Create a constructor that will initialize those variables. 
//	Print name & address of given  student using displayInfo method.

	
	String name;
	String address;
	
	Task (){
		
		name = "Seyma Atasoy";
		address = "123 Main Ave";
		
	}
	
	 void displayInfo() {
		
		 System.out.println("The name of the student is = "+name);
		 System.out.println("The address of the student is = "+address);
		
	}
	 public static void main(String[] args) {
		
		Task task = new Task ();
		
		task.displayInfo();
	}
}
