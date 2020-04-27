package com.syntax.class22;

public class Student {
	
	void bePresent () {
		System.out.println("You should be %100 present while listening the class");
	}
	void doHomeWork() {
		System.out.println("Do your homeworks on time");
	}
	void study () {
		System.out.println("Study study study");
	}
	void learn() {
		System.out.println("Always learn new things");
	}

	public static void main(String[] args) {
		
		Student student = new SyntaxStudent();//upcasting
		student.doHomeWork();
		student.learn();
		
		Student student2 = new CollegeStudent();
		student2.study();
		student2.bePresent();
		
		Student student3 = new SchoolStudent();
		student3.doHomeWork();
		student3.study();
			
		
	}
}
class SyntaxStudent extends Student {
	void learn() {
		System.out.println("Online learning is possible");
	}
}
class CollegeStudent extends Student {
	void study() {
		System.out.println("College students need to be in class ");
	}
}
class SchoolStudent extends Student{
	void doHomeWork() {
		System.out.println("Teacher will check if you'd done it");
	}
}
