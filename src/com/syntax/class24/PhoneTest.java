package com.syntax.class24;

public class PhoneTest {

	public static void main(String[] args) {
		
		//We cant create the object of the phone because it is uncompleted
		
		//Phone p = new Phone (); CE we can not instantiate/ create an object
		Phone iphone = new iPhone();// We are upcasting
		iphone.call();
		iphone.text();
		iphone.takePicture();
		iphone.playMusic();
		
		System.out.println("***********************");
		
		Phone samsung = new Samsung();
		samsung.call();
		samsung.text();
		samsung.takePicture();
		samsung.playMusic();
		
		
	}
}
