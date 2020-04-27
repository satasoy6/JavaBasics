package com.syntax.class25;

public interface Drivable {
	
	//compiler by default adds public static final
	
	public static final boolean MOVE_FAST = true;
	
	//compiler by default adds public abstract
	void drive();
	
	
}
	abstract class Vehicle {
		abstract void stop();
	
}
class Cars extends Vehicle implements Drivable{

	@Override
	public void drive() {
		System.out.println("Car drives");
		
	}

	@Override
	void stop() {
		System.out.println("Car stops");	
	}
	
}
