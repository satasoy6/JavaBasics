package com.syntax.class23;

public class Computer {

	String brand;
	public Computer(String brand) {
		this.brand = brand;
	}
	public void display(){
		System.out.println("My computer brand is "+brand );
	}
	public void batteryLife() {
		System.out.println(brand+ " has battery life for 18 hours");
	}
}
class Apple extends Computer{
	public Apple (String brand) {
		super(brand);
	}
	public void virus () {
		System.out.println("Rumor has it, "+brand+" doesn't get caught to any virus");
	}
	public void batteryLife() {
		System.out.println(brand+ " has battery life for 32 hours");
	}
}
class Lenovo extends Computer{
	public Lenovo(String brand) {
		super (brand);
		
	}
	public void design(){
		System.out.println(brand+" has a very sleek design");
	
}
	public void batteryLife() {
		System.out.println(brand+ " has battery life for 21 hours");
	}
}
class HP extends Computer{
	public HP(String brand) {
		super (brand);
	}
	public void batteryLife() {
		System.out.println(brand+" battery can go up to 28 hrs");
	}
}
class Dell extends Computer{
	public Dell(String brand) {
		super (brand);
	}
	public void batteryLife() {
		System.out.println(brand+ " has battery life for 20 hours");
	}
}
