package com.syntax.class24;

public class FileTest {
	
	public static void main(String[] args) {
		
	File f1,f2,f3;
	
	f1 = new JavaFile();
	f1.open();
	f1.close();
	f1.edit();
	System.out.println("***********************");
	
	f2 = new WordFile();
	f2.open();
	f2.close();
	f2.edit();
	System.out.println("***********************");
	
	f3 = new PDFFile();
	f3.open();
	f3.close();
	f3.edit();
	
	
			
			
			
	}
}
