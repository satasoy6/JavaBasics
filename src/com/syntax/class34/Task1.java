package com.syntax.class34;

public class Task1{
	
	public static void main(String[] args) {
		
		ageEligibility(18);
		ageEligibility(14);
	}
	public static void ageEligibility(int age) {
		if (age>16) {
			System.out.println("You are eligible");
		}else {
			throw new RuntimeException("You are too little");
		}
	}
}