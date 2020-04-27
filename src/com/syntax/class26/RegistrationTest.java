package com.syntax.class26;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration user = new Registration();
		user.setEmail("seyma@yahoo.com");
		System.out.println(user.getEmail());
		
		user.setUserName("satasoy");
		System.out.println(user.getUserName());

		user.setPassword("daodjsnc345");
		System.out.println(user.getPassword());
		
		
	}
}
