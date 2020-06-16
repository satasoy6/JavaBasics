package com.syntax.class34;

public class Task2 {
	public static void main(String[] args) {
		
		checkUserName("satasoy");
		checkUserName("ata");
	}

	public static void checkUserName(String userName) {
		if(userName.length()<5) {
			throw new RuntimeException ("Username can't be less than 5 characters");
		}else {
			System.out.println("This user name is available");
		}
	}
}
