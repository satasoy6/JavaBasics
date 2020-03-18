package com.Seyma.calismalari;

public class Patterns {

	public static void main(String[] args) {
		
	//	*
	//	**
	//	***
	//	****
	//	***
	//	**
	//	*
		
		for (int i = 1; i<=5; i++) {
			
			for (int j = 0; j< i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		for (int z = 1; z<=4;z++) {
			for (int k = 5;k>z;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
