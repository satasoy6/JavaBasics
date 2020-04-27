package com.syntax.class26;

public class Registration {

	private String email;
	private String userName;
	private String password;

	public String getEmail () {
		return email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		if(!email.isEmpty() && email.endsWith("yahoo.com")) {
			this.email=email;
		}else {
			System.out.println("Please use only yahoo account");
		}
	}
	public void setUserName(String userName) {
		if(!userName.isEmpty() && userName.length()>6) {
			this.userName=userName;
		}else {
			System.out.println("User name can't be empty and length should be more than 6 characters");
		}
	}
	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if(password.length()>6) {
				if(password.contains(userName)) {
					System.out.println("Password can't contain the user name");
				}else {
					this.password=password;
					
				}
			}else {
				System.out.println("Password has to be at least 6 characters");
			}
		}else {
			System.out.println("Password can't be empty");
		}
	}
	}

