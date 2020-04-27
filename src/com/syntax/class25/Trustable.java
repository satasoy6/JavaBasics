package com.syntax.class25;

public interface Trustable {
	//parent interface
	//by default compiler will make method to be public and abstract
	void trust();

}
interface Bank extends Trustable{
	// child interface
	// by default compiler will make the methods abstract method
	
	void deposit ();
	
	void withdrawal();
	
}
class BOA extends Finance implements Bank , CreditUnion{

	@Override
	public void trust() {
		System.out.println("BOA is trustable");
		
	}

	@Override
	public void deposit() {
		System.out.println("You can make a deposit at BOA");
		
	}

	@Override
	public void withdrawal() {
		System.out.println("You can withdraw your money at BOA");
		
	}

	@Override
	public void giveCredit() {
		System.out.println("BOA gives credit");
		
	}
	
}

interface CreditUnion{
	
	void giveCredit ();
}
class Finance{
	public void financing() {
		System.out.println("Dealing with financing");
	}
	
}
