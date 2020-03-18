package com.syntax.class04;

public class NestedifContinued {

	public static void main(String[] args) {
		
		//check if patient has any allergies
		
		boolean allergy=true;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=false;
		if(allergy) {System.out.println("Please answer below");
		
		   if(orangeAllergy) {
			   System.out.println("Do not eat oranges");
			   
		   } 
		   if (appleAllergy) {System.out.println("Do not eat apples");
		   
		   }
		  
		}else {System.out.println("You are healthy");
	}

}
}
