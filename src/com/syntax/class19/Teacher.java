package com.syntax.class19;

public class Teacher {
	
    String name;
    String major;
	int age;
	long salary;
	String schoolAddress;
	
	
	public void teach () {
		
		System.out.println(major+" "+name+" teaches lessons to the students");
	}
	public void giveHomeWork() {
		System.out.println(major+" "+name+" teachers give homeworks");
		
	}
	public void exam() {
		System.out.println(major+" "+ name+" teachers test students with exams");
		
		
	}
	
	
}
