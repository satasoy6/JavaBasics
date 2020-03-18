package com.syntax.class08;

import com.sun.tools.sjavac.server.SysInfo;

public class RetrieveElements {

	public static void main(String[] args) {
		
		char [] grades = {'A','B','C','D','E','F'};
		//getting all elements
		
		for (int i = 0; i<grades.length;i++) {
			System.out.println(grades[i]);
		}
		System.out.println("-------printing using advanced for loop--------");
		//advanced for loop-->when you know how many elements you have
		
		for (char grade:grades) {
			
			System.out.print(grade+" ");
			
			//create an array of fruits and retrieve all elements
			
			String [] fruits = {"Banana","Kiwi","Apple","Mango"};
			
			
			//advanced for loop, enhanced for loop, for each loop
			
			for (String fruit:fruits) {
				System.out.println(fruit);
					
			}
			
			System.out.println("----------------");
			//regular for loops
			for (int i = 0; i<fruits.length;i++) {
				System.out.println(fruits[i]);
			}
			System.out.println("-----------------");
			//print the favorite fruit
			
			for (String fruit:fruits) {
				if( fruit.equals("Apple")) {
					System.out.println(fruit+" is your favorite fruit");
				}else {
					System.out.println(fruit);
				}
						
			}
		}
		
	}

}
