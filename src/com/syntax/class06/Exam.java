package com.syntax.class06;

public class Exam {
	public static void main(String[] args) {
		
		int temperature = 95;
		boolean sunny = true;
		
		if (temperature>90) {
			System.out.println("It is hot outside");
			if (sunny==true)System.out.println("It is also sunny");
			else System.out.println("It is also cloudy outside");
		}
		
		else {
			System.out.println("It is not hot outside");
			if (sunny==true)System.out.println("It is also sunny");
			else System.out.println("It is also cloudy outside");
		}
	}
	

}
