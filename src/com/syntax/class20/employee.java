package com.syntax.class20;

public class employee {
	
	public static String company;
	protected int empId;
	double salary;
	private long ssn;//visibility of the private class 
					//always stays in the same class
	
	void getPaid() {
		System.out.println("Employee gets "+salary);
		
	}
	static void work() {
		System.out.println("Employee work at " + company);
		
	}

}
