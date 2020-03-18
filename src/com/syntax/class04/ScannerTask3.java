package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Which city?");
		
		String city= input.nextLine();
		
		System.out.println("What is the temperature?");
		float temp = input.nextFloat();
		temp=((temp-32)*5/9);
		
		
		System.out.println("The temperature of the "+city+" is "+temp);
		
		

	}

}
