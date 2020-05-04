package com.syntax.class34;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		NullPointerException npe=new NullPointerException();
		//throw npe;
		
		
	}
	
	//create a withdraw method for balance and amount
	public static void withdraw(int balance, int amount) {
		
		if(amount>balance) {
			throw new RuntimeException("Your balance is too low");
		}
	}
	
	
	public static void throwException() {
		throw new ArithmeticException();
	}
}
