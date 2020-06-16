package com.syntax.class25;

public interface Drivable {
	
	//compiler by default adds public static final
	
	public static final boolean MOVE_FAST = true;
	
	//compiler by default adds public abstract
	void drive();
	
	
}
	abstract class Vehicle1 {
		abstract void stop();
	
}
class Cars extends Vehicle implements Drivable{

	Cars(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive() {
		System.out.println("Car drives");
		
	}

	@Override
	protected
	void stop() {
		System.out.println("Car stops");	
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void brake() {
		// TODO Auto-generated method stub
		
	}
	
}
