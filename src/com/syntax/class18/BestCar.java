package com.syntax.class18;

public class BestCar {
	
	String make, model, color;
	int year, door,wheels;
	
	public void printDetails() {
		
		System.out.println("I have "+year+" "+make+" "+model+" in "+color+" color");
		System.out.println(make+ " has "+door+" doors and "+wheels+" wheels");
	}

	BestCar(String carMake, String carModel, String carColor, int carYear, int carDoor, int carWheels){
		
		make=carMake;
		model=carModel;
		color=carColor;
		year=carYear;
		door=carDoor;
		wheels=carWheels;
	}
	public static void main(String[] args) {
		
	  BestCar car = new BestCar("BMW","m5","Grey",2020, 4,5);
		
		car.printDetails();
				
		
	}
}
