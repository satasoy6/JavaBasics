package com.syntax.class19;

public class TestClass {

	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.breed = "Husky";
		dog.color = "Black";
		dog.fur = "Thick";
		dog.size = "Large";
		
		
		//access method from own class
		dog.bark();
		//access methods from the parent class
		dog.eat();
		dog.beWild();
		dog.sleep();
		
		Dog.age = 3;
		Dog.display();
		
		Animals animal = new Animals();
		
		animal.color = "Any";
		animal.size = "Any";
		animal.fur = "Any";
		
		
	}
}
