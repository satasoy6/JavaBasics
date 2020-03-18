package com.syntax.class07;

public class PostAndPreincrement {

	public static void main(String[] args) {
	
		
		
//		 ++, --
//		 preincrement ++y, postincrement y++
		
		int z;
		int y=10;
		z=y++;//postincrement = first use the variable then increment
		System.out.println(y);
		
		int w= 10;
		int x=10;
		w=++x;//preincrement first increment then use
		System.out.println(w);
		
		int num=1;
		while(num<5) {
//			
			System.out.println(++num);
		}
		
		int num1=1;
		while(num1<5) {
			
			System.out.println(num1++);
		}
		

	}

}
