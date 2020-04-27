package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {
		
//		Computer apple = new Apple("Apple");
//		Computer leno = new Lenovo("Lenovo");
//		Computer hp = new HP ("HP");
//		Computer dell = new Dell("Apple");
//		
//		Computer [] pc = {apple,leno,hp,dell};
	
		//instead of typing all that, we can just go with the below !
		
		Computer [] pc = { new Apple("Apple"),new Lenovo("Lenovo"),new HP ("HP"),new Dell("Apple")};
	
		for (Computer c : pc) {
			c.batteryLife();
			c.display();
			System.out.println("****************");
		}
	}
}
