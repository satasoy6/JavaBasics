package com.syntax.class18;

public class Task2 {
	
//	Write a java program of Class Students that takes students name 
//	and 3 subject grades. Inside your class also have a method to 
//	Calculate Average Grade. Test Student class for 5 different 
//	students with different marks. Your program should print
//	an average mark of each students name.
	
	
	String name;
	int grade1, grade2,grade3;
	Task2(String studentName,int studentGrade1, int studentGrade2, int studentGrade3){
		
		name= studentName;
		grade1=studentGrade1;
		grade2=studentGrade2;
		grade3=studentGrade3;
	}
	public int gradeAverage() {
		
		
		int total = grade1+grade2+grade3;
		int average = total/3;
		return average;
	}
	

}
