package com.Patterns;

public class HalfDiamiondPattern {

	public static void main(String[] args) {
		
		
		for (int x = 1; x<=10 ; x++) {
			for (int y = 1;y<=x;y++) {
				System.out.print(y+" ");
			}System.out.println();
		}
		for (int i = 9 ; i>=1 ; i--) {
			
			for (int j = 1;j<=i; j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}
