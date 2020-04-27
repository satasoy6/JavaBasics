package com.syntax.class27;

public abstract class Food {
	
//	hw create food class that will have 3 undefined methods
//	and it will have 4 subclasses; 
//	create a collection of food and using 3 ways execute methods
	

	String foodType;
	String ingredient;
	int calories;

	public Food(String foodType, String ingredient, int calories) {
		this.foodType=foodType;
		this.ingredient=ingredient;
		this.calories=calories;
	}
	public abstract void cook();
	public abstract void boil();
	public abstract void grill();
	
	
	
}
class Makarna extends Food{
	
	public Makarna(String foodType, String ingredient, int calories) {
		super(foodType, ingredient, calories);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cook() {
		System.out.println("Makarna cooks");
		
	}

	@Override
	public void boil() {
		System.out.println("Boil the pasta");
		
	}

	@Override
	public void grill() {
		System.out.println("Grilled pasta");
		
	}
	
}
class Kebab extends Food{

	public Kebab(String foodType, String ingredient, int calories) {
		super(foodType, ingredient, calories);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cook() {
		System.out.println("ye kebabi ic salgami!");
		
	}

	@Override
	public void boil() {
		System.out.println("You can't boil the kebab");
		
	}

	@Override
	public void grill() {
		System.out.println("Grill the juicy lamb");
		
	}
	
}
class Menemen extends Food{

	public Menemen(String foodType, String ingredient, int calories) {
		super(foodType, ingredient, calories);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cook() {
		System.out.println("Cook the menemen anytime of the day");
		
	}

	@Override
	public void boil() {
		System.out.println("You can't boil menemen");
		
	}

	@Override
	public void grill() {
		System.out.println("You can't grill");
		
	}
	
}
class Manti extends Food{

	public Manti(String foodType, String ingredient, int calories) {
		super(foodType, ingredient, calories);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cook() {
		System.out.println("Cook Manti with tomato sauce");
		
	}

	@Override
	public void boil() {
		System.out.println("Boil the manti");
		
	}

	@Override
	public void grill() {
		System.out.println("Grill the manti");
		
	}
	
}
	


