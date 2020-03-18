package com.Seyma.calismalari;

import java.util.Scanner;

public class FindPrimeNumber2 {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		   
			     
			  int i,m=0,flag=0;      
			  //it is the number to be checked
			  int n=0;
			  
			  m=n/2;     
			  
			  if(n==0||n==1){  
			   System.out.println(n+" is not prime number"); 
			  n =scan.nextInt();
			  
			  }else{
				  
			   for(i=2;i<=m;i++){      
			    if(n%i==0){      
			    	i=scan.nextInt();
			     System.out.println(n+" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  { System.out.println(n+" is prime number"); }  
			  }//end of else  
			}    
			  
	}

