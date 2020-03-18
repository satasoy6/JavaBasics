package com.syntax.class04;

public class MortgageTask {

	public static void main(String[] args) {
		
		
		double mRate=4.2;
		int mPrice=150000;
		
		if(mRate>4.5) {
			System.out.println("I will not buy the house");
			if (mRate>4.5) {
				System.out.println("I will not buy the house");
				
			}
		}else {
			System.out.println("I will consider buying the house");
			if (mPrice>200000) {System.out.println("I will take a loan");
			
			}else {
				System.out.println("I will buy cash");
			}
		}
		
	}

}
