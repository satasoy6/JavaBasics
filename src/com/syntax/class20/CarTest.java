package com.syntax.class20;

public class CarTest {
	
	Car car = new Car();
	
  public static void main(String[] args) {
	
	System.out.println("----------------------");
	
	mercedes merc1 = new mercedes ();
	merc1.display();
	
	mercedes merc = new mercedes ("Mercedes","S","AMG");
	merc.display();
	
	mercedes merc2 = new mercedes ("Mercedes","M","NO AMG");
	merc2.display();
}
}
