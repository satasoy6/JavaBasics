package com.syntax.class22;

public class Employee {
	
	double salary;
	void getPaid() {
		
		System.out.println("Employee gets paid "+salary);
	}
	void work () {
		System.out.println("Employee works");
	}

}
class FullTime extends Employee{
	
	
}
class PartTime extends Employee {
	
	
}
class Contractor extends Employee {
	
	double hourlyRate;
	void getPaid() {
		System.out.println("Contractor gets paid "+hourlyRate);
	}
}
