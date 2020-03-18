package com.syntax.class07;

public class LoopsMoreReview {

	public static void main(String[] args) {
		
	
		
		int evensSum=0;
		int oddsSum=0;
	

		
		for (int z = 1; z<=99; z++) {
			if(z%2==0) {
				evensSum=evensSum+z;
			}else {
				oddsSum=oddsSum+z;
			}
		}System.out.println("Sum of evens ="+evensSum);
		System.out.println("Sum of odds ="+oddsSum);
	}

}
