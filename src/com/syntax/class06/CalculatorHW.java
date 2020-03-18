package com.syntax.class06;

import java.util.Scanner;

public class CalculatorHW {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double x,y;
        char op;
        double summary=0;
        
        
        
        
        scan=new Scanner(System.in);
        
        System.out.println("Please enter first number ");
        x=scan.nextInt();      
        System.out.println("Please enter your second number");
        y=scan.nextInt();  
        System.out.println("please enter operator");
        op=scan.next().charAt(0);
        
        switch(op){
            
        case '+':
            summary=x+y;
            break;
        case '-':
            summary=x-y;
            break;
        case '*':
            summary=x*y;
            break;
        case '/':
            summary=x/y;
            break;
        default:
            System.out.println("Please enter a valid number");
            
                    
        }
        
        System.out.println("Result of the "+x+op+y+" = "+summary);
        
        
	}

}
