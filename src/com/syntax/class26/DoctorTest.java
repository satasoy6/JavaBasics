package com.syntax.class26;

public class DoctorTest {

	public static void main(String[] args) {
		Doctor doc = new Doctor();
		doc.setEmail("atasoy@yahoo.com");
		System.out.println(doc.getEmail());
		
		doc.setEmail("doctor@gmail.com");
		System.out.println(doc.getEmail());
	}
	
}
