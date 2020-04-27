package com.syntax.class28;

public abstract class Card {

	String creditCardType;
	Card(String creditCardType ){
		this.creditCardType=creditCardType;
	}
	public abstract void apply();
	public abstract void getLoan();	
	public void ageLimit() {
		System.out.println("You need to be at least 18 years old to apply to a credit card");		
	}
}
class AMEX extends Card {
	AMEX(String creditCardType) {
		super(creditCardType);
	}
	@Override
	public void apply() {
		System.out.println("If you apply "+creditCardType+" you get 15 months %0 Intro APR");		
	}
	@Override
	public void getLoan() {
		System.out.println(creditCardType+" gives loan to small business owners");		
	}	
}
class CitiBank extends Card{
	CitiBank(String creditCardType) {
		super(creditCardType);		
	}
	@Override
	public void apply() {
		System.out.println("If you apply "+creditCardType+" you get %0 Intro balance transfer APR for 12 months");		
	}
	@Override
	public void getLoan() {
		System.out.println(creditCardType+" gives loan to students");		
	}	
}
class Discover extends Card{
	Discover(String creditCardType) {
		super(creditCardType);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void apply() {
		System.out.println("If you apply "+creditCardType+" you get %2 back at every purchase for 12 months");		
	}
	@Override
	public void getLoan() {
		System.out.println(creditCardType+" gives loan to Large companies");		
	}	
}