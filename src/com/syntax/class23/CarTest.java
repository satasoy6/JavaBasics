package com.syntax.class23;

public class CarTest {

	public static void main(String[] args) {
		
		Car	bmw	= new BMW("BMW");//referring obj to parent class
	//	bmw.xeonLights();//Won't be available. Because onj refers to the parent class
		//And paretn class doesnt have it 
		Car tesla = new Tesla("Tesla");
		Car merc = new Mercedes("Mercedes");
		Car honda = new Honda("Honda");
		
		Car [] cars={bmw, tesla, merc, honda};
		
		for (Car c:cars) {
			c.start();//methods based on the obj type will be executed.
			c.display();
			System.out.println("-----------");
			//if child class doesnt have the method, parent class method will be executed
						
			}
		System.out.println("~~~~~~Other For Loop~~~~~~");
		
		for (int i = 0; i<cars.length;i++) {
			cars[i].start();
			cars[i].display();			
			System.out.println("~~~~~~~~~~~~~~~~");
		}
	}
}
