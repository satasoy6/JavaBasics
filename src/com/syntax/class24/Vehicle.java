package com.syntax.class24;

public abstract class Vehicle {
	
	String color ;
	
	static int totalVehicles; // we can have static variables in abstract class
	Vehicle(String color){
		this.color = color;
		totalVehicles++;
	}
	public static void total() {// we can create static methods in abstract
		System.out.println("we build "+totalVehicles);
	}
	public void drive() {
		System.out.println("Vehicle drives");
	}
	public void stop() {
		System.out.println("Vehicle stops");
	}
	public abstract void start ();
	public abstract void brake();
	
	//can abstract method ne static ? NO
//	public abstract static void m1 ();
	
	//can abstract method be final ? no
//	public abstract final method m2 ();
	
	//can abstract method be private? no
//	private abstract void m3();

}
abstract class Car extends Vehicle {
	
	String carType;
	Car(String color, String carType){
		super(color);
		this.carType = carType;
	}
	public void brake() {
		System.out.println(carType+" have brakes");
	}
}
class Tesla extends Car {
	String make;
	
	Tesla (String color, String carType, String make){
		super(color,carType);
		this.make = make;
	}
	public void drive () {
		System.out.println(make+" drives on autopilot");
	}

	@Override
	public void start() {	//provide implementation
		System.out.println(make+" starts remotely");
	}
	public void display() {// as a child can have its own method
		System.out.println("We have "+color+" "+make+" "+carType);
	}
}
class Toyota extends Car {
	String make;
	
	Toyota (String color, String carType, String make){
		super (color, carType);
		this.make = make;
	}

	@Override
	public void start() {
	
		
	}
}
class Bus extends Vehicle{
	
	Bus(String color) {
		super(color);
		
	}
//	public void tire() {
//		System.out.println("Buses have 8 tires");
//	}
	public void start () {
		System.out.println("Bus can drive fast");
	}
	public void brake() {
		System.out.println("Bus should brake at red light camera");
	}
}
class schoolBus extends Bus {

	schoolBus(String color, String carType) {
		super(color);	
	}

	@Override
	public void start() {
		System.out.println("School bus starts with an ignition key");		
	}

	@Override
	public void brake() {
		System.out.println("School bus brakes are strong");
		
	}
	
}
