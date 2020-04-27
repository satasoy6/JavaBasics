package com.syntax.class26;

public class Employee {

	private String name;
	private int age;
	private double salary;
	
	//define public methods to give an access to private variables
	//getters = I am giving you access to get my variables
	
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	//setters = I am giving you writing access
	
	public void setName(String name) {
		if (!name.isEmpty() && name.length()<6) {
		this.name = name;
		}	
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	public void getSalary (double salary) {
		this.salary = salary;
	}
}
