package com.syntax.class05;

import java.util.Scanner;

public class HomeWork3 {
public static void main(String[] args) {
	
	Scanner num=new Scanner(System.in);
	double number=0;
	System.out.println("Please enter your first decimal number");
	double a= num.nextDouble();
	
	System.out.println("Please enter your second decimal number");
	double b=num.nextDouble();
	
	System.out.println("Please enter your third decimal number");
	double c=num.nextDouble();
	
	if(a>b&&a>c) {
		number=a;
	}else if(b>a&&b>c) {
		number=b;
	}else if(c>a&&c>b) {
		number=c;
		System.out.println("The largest number is "+number);
	}
	


}
}
