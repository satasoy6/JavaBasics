package com.syntax.class22;

public class CreditCard {
//	Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance. 
//	Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
//	Call the method by creating an object of each of the three classes.
//	
	
		double balance, interest;
		CreditCard(double balance){
		this.balance = balance;
		}
		double interest () {
		interest = balance*0.2/12;
		return interest;
		}
		}
		//visa Class without any overriding
		class Visa extends CreditCard{
		Visa (double balance){
		super(balance);
		}
		}
		//AX class with overriding method
		class AX extends CreditCard {
		AX (double balance){
		super(balance);
		}
		double interest () {
		interest = balance*0.24/12;
		return interest;
		}
		}
