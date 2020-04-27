package com.syntax.class17;

public class Employee {
	
	//create variables to hold : name, lastName,title, ssn;
	public static String title;
	
	
	public String name ;//accesible everywhere
	protected String lastName;// accessible within same package
	double salary;// accesible within same package
	private long ssn;//accessible ONLY within same class
	
	public static void method1() {
		
		System.out.println("I am public method");
	}
	protected void method2() {
		
		System.out.println("I am protected method");
	}
	void method3 () {
		
		System.out.println("I am default method");
	}
	private void method4 () {
		
		System.out.println("I am a private method");
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.name="John";
		emp.lastName="Smith";
		emp.salary=90000;
		emp.ssn=88978558;
		
		//accessing all methods 
		
		method1();
		emp.method2();
		emp.method3();
		emp.method4();
	}

}
