package com.syntax.class14;

public class Dogs {

	String breed;
	String color;
	String name;
	int age;
	
	//behavours
	
	
	

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
	dog1.bark();
	dog1.eat();
	
	Dogs dog2 = new Dogs();
	dog2.breed = "Bulldog";
	dog2.color = "Black";
	dog2.name = "Karabela";
	dog2.age = 7;
	
	dog2.bark();
	dog2.eat();
	dog2.sleep();
	
	
	
	}
	
	void bark (){
		System.out.println(breed+" can bark");
	}
	void walk (){
		System.out.println(breed+" can walk");
	}
	void eat (){
		System.out.println(breed+" can eat");
	}
	void sleep() {
		System.out.println(breed+" can sleep");
	}
}
