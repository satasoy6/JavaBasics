package com.syntax.class26;

public class Recap {

	
	public static void main(String[] args) {
		
		int num = 10;
		Doctor doctor = new Doctor();
		
		int [] numbers = {10,20,30,40};
		
		Doctor [] doctors = {new Doctor(), new Doctor(), new Doctor()};
		
		String [] names = new String [2];
		
		names [0]= "Vital";
		names [1]= "Ghulam";
		
		System.out.println("--------------");
		//names [2] = "Jawid"; during runtime Java will give an exceptions because arrays are fied in size
		
	}
}
