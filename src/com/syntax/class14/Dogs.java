package com.syntax.class14;

public class Dogs {

	String breed;
	String color;
	String name;
	int age;
	
	//behavours
	
	void bark (){
		System.out.println("Dogs can bark");
	}
	void walk (){
		System.out.println("Dogs can walk");
	}
	void eat (){
		System.out.println("Dogs can eat");
	}
	

	public static void main(String[] args) {
		
	
	Dogs dog1 = new Dogs();
	
	
	String breed;
	String color;
	String name;
	int age;
	
	dog1.breed ="German Shepherd";
	dog1.color = "Black and brown";
	dog1.name = "Rambo";
	dog1.age = 4;
	
	dog1.walk();
	
	}	
}
