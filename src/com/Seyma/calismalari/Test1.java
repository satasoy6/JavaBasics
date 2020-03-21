package com.Seyma.calismalari;

public class Test1 {

	
	public static void main(String s[]) {
//		
//		int[] a = {12, 15, 11, 13, 9, 25};
//		int[] a2 = {12, 15, 11, 13, 9, 25};
//		int sum = 0;
//		for (int i = 0; i <a.length; i++) {
//		         if (a[i] % 2== a2[i ] % 5)  {
//		                  sum += i * i;
//		         }
//		}
//		System.out.println("sum = " + sum);
//		
//		
//		int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//
//		int sum = 0;
//
//		for (int i = 0; i < 3; ++i) {
//
//		   for (int j = 0; j < 3; ++j) {
//
//		       sum = sum + array_variable[i][j];
//
//		   }
//
//		}
//
//		System.out.print(sum / 5);
//		
		
		int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		int what = array[0];

		for (int index = 0; index < array.length; index++) {

		       if (array[index] > what) {

		                  what = array[index];
		       }
		}
		System.out.println(what);
		
		int[] zip = new int[5];

		zip[0] = 7;
		zip[1] = 3;
		zip[2] = 4;
		zip[3] = 1;
		zip[4] = 9;

	
		System.out.println( zip[ 2 + 1 ] );
		
		
//		int z = 0;
//	     for (int y = 0; y >= z; y++) {
//	         System.out.print(y + "~");
//	         System.out.println(z);
//	         
//	     }
		
		
		
		 for(int i = 0; i <= 5; i++ )
	        {
	            System.out.println("i = " + i );
	        }
		 
	
	    
		 

	
		
		 
		 int z=2, sum=0;

		 while(z<9) {

		    z++;

		    sum=sum+z;

		 }

		 System.out.print(sum);

		 
		 int m=2, total=0;

		 while(m<6) {

		    total=total+m;

		    m++;

		 }

		 System.out.print(total);
		 

	}
}
