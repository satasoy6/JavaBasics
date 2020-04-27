package com.syntax.class25;

public class MarksTest {

	public static void main(String[] args) {
		
		Marks st1 = new StudentA(54, 76, 37);
        Marks st2 = new StudentB(54, 82, 44, 100);
        System.out.println(st1.getPercentage());
        System.out.println(st2.getPercentage());
	}
}
