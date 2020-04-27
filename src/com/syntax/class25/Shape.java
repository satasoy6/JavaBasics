package com.syntax.class25;

public interface Shape {
	
	void calculateArea (double x);
	void calculatePerimeter(double x);
	
	public static void main(String[] args) {
		
		Shape circle = new Circle();
		circle.calculateArea(10);
		circle.calculatePerimeter(20);
		
		Shape square = new Square ();
		square.calculateArea(10);
		square.calculatePerimeter(20);
	}

}
class Circle implements Shape{

	@Override
	public void calculateArea(double x) {
		System.out.println("Area of a circle => "+(3.14 * x * x));
		
	}

	@Override
	public void calculatePerimeter(double x) {
		System.out.println("Perimeter of a Circle is =>"+(2 * 3.14 * x));
	}
	
}
class Square implements Shape{

	@Override
	public void calculateArea(double x) {
		System.out.println("Area of a square is => "+(x * x));
	}

	@Override
	public void calculatePerimeter(double x) {
		System.out.println("Perimeter of a square is => "+(4 * x));
		
	}
	
}
