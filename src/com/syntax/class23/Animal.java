package com.syntax.class23;

public class Animal {
	
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
	public void sleep() {
		System.out.println("Animal sleeps");
	}

}
class Bird extends Animal{
	//@Override
	//We are not overriding this process calls method
	public static void whoAmI() {//this method is hiding from the parent
		System.out.println("I am a bird");
	}
	public void sleep() {
		System.out.println("Bird sleeps");
	}
	public void eat() {
		System.out.println("Birds eat");
	}
	
}
