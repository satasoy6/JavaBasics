package com.syntax.class26;

public class Doctor {

	private long licenseId;
	private long phoneNumber;
	private String email;
	
	public void setEmail(String email) {
		if(!email.isEmpty()) {
			if(email.endsWith("gmail.com")) {// or .contains("gmail")
				this.email=email;
			}else {
				System.out.println("Email must be a gmail type");
			}
		}else {
			System.out.println("Email can't be empty");
		}
				
	}
	
	public String getEmail() {
		return email;
	}
}
