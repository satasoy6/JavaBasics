package com.syntax.class12;

public class SplitFunction {

	
	public static void main(String[] args) {
		
		String today = "Today is my favorite Java Class";
		
		String [] array =today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite Java Class";
		String [] stringArray = today1.split("a");
		
		
		//print all elements from array 1 by 1
		
		//element type variableName:name of array
		
		for (String    arr   : stringArray) {
			
			System.out.println(arr+"I");
		}
		
		
	}
}
