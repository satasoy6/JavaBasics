package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {

	public static void main(String[] args)  {
		
		try {				//Inside try block we are placing the code that might cause an exception
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {//We need to specify what kind of exception that will occur
			
		}
		System.out.println("Continue to the next try block");
		
		String filePath="";
		try {
			FileInputStream fis=new FileInputStream(filePath);
		}
		catch(FileNotFoundException fne) {//If you specify wrong exception, compiler still throw an exception but not gonna get caught
			System.out.println("Catched FileNotFoundException Exception");
		}
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);//new arithmetic exception
			System.out.println("I am code inside try block");//this block will get ignored if exception occur
		}
		catch(RuntimeException ae) {
			System.out.println("Catched ArithmeticException Exception");
			
		}
		System.out.println("End of the program");
		//Why arithmetic, you want to divide some number with a zero
		//NullPointerException-->you are pointing to a null object	
		//ArrayindexOutofbound
		//FileNotFound
	}
}
