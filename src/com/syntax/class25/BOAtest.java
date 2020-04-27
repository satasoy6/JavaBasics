package com.syntax.class25;

public class BOAtest {

	public static void main(String[] args) {
		
		//create the obj of BOA
		BOA bank = new BOA();
		bank.trust();
		bank.deposit();
		bank.financing();
		bank.giveCredit();
		bank.withdrawal();
		
		Bank bank1 = new BOA();
		bank1.deposit(); 
		bank1.trust();
		bank1.withdrawal();
		
		Trustable t = new BOA();
		t.trust();
		
	}
}
