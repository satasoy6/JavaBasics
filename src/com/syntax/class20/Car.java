package com.syntax.class20;

public class Car  {
	
	String make, model;

	public Car() {
		System.out.println("I am parent class constructor");		
	}
	public Car (String make , String model) {
		this.make = make;
		this.model = model;
	}
	
}
 class mercedes extends Car{
	 
	 String sportModel;
	
 public	mercedes(){
// 	 super();// compiler add super () by default
	 // and goes to the default constructor
	 System.out.println("I am child class constructor");
		
		
	}
 
 public mercedes (String make, String model, String sportModel) {
	// super("Mercedes","S");Any values we don't want to hard code
	 //Pass them as variables
	 super(make, model);
	 this.sportModel = sportModel;
 }
 public void display() {
	 
	 System.out.println("I have "+make+" "+model+" "+sportModel);
 }
}