package com.syntax.class22;

public class AnimalTest {

	public static void main(String[] args) {
	Animal obj =new Tiger();
	obj.sleep();
	obj.eat();
//	obj.run();CE method run ()is undefined in Animal class
	
	
	System.out.println("------Accessing methods using Parent class---------");
	Animal animal = new Animal ();
	
	//method only of parent class will be available
	animal.eat();
	animal.sleep();
	
	System.out.println("----------Accessing methods using child class----------");
	Tiger tiger = new Tiger();
	tiger.sleep();
	tiger.eat();
	tiger.run();
	
	}
}
