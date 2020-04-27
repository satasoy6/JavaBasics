package com.syntax.class19;

public class MathTeacher extends Teacher{
	
	String environment;
		public void solveProblems() {
			
			environment = "classroom";
			
			System.out.println(major+" "+name+" solves math problems in the "+environment+" at "+schoolAddress);
			System.out.println(major+" "+name+" earns "+salary+" annually");
	}

}
