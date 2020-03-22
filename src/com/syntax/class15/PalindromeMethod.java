package com.syntax.class15;

public class PalindromeMethod {

	void palindrome(String a) {
		
		boolean f=false;
		String reverse="";
		String x=a.replaceAll("[^A-Za-z]", "");
		for (int i=a.length()-1; i>=0; i--) {
			reverse=reverse+x.charAt(i);
	        if (a.equals(reverse)) {
	        f=true;
	        } else {
	          f=false;
	        }
		}
		System.out.println(f);
		
		
		}
		
		
	
	public static void main(String[] args) {
		
		PalindromeMethod pal = new PalindromeMethod();
		
		pal.palindrome("kayak");
		
		
	}
	
}
