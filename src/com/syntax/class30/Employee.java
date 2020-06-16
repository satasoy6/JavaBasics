package com.syntax.class30;

import java.util.Map;
import java.util.TreeMap;
public class Employee {
	String firstName, lastName;
	double salary;
	Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		
		
	}
	public static void main(String[] args) {
		
		Map<String,Integer> emp = new TreeMap<>();
//		emp.put(key, value)
		
	}
	public void empDetails() {
		System.out.println( firstName + " " + lastName + " = $" + salary);
	}
}
