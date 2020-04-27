package com.syntax.class24;

public class VehicleTest {
	
	public static void main(String[] args) {
		
		
		
	Vehicle tesla = new Tesla("Yellow", "SUV","Tesla");
	tesla.drive();
	tesla.stop();
	tesla.start();
	tesla.brake();
//	tesla.display();CE: Method is not defined in Vehicle
	
//	new Bus ("white");
//	new Toyota("red","Sedan","toyota");
//	new Toyota("blue","sedan","toyota");
//	new Bus ("white","long vehicle", "GMC");
//	Toyota.total();
	
	Vehicle[] va= {new schoolBus("yellow", "long")};
	for(int i=0; i<va.length; i++) {
		va[i].brake();
		va[i].drive();
		va[i].start();
		va[i].stop();
	}
	}

}
