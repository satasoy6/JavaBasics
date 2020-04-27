package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {
		 String insuranceName;	 
	 public Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
	}
	public abstract void getQuote();
	 public abstract void cancelInsurance();	
	 public static void main(String[] args) {		
		 ArrayList <Insurance> list = new ArrayList<>();
		 list.add(new Pet("Meow care","Cat"));
		 list.add(new Car("Progressive","Toyota 2019"));
		 list.add(new Health("Medicaid"));		 
		 System.out.println("------For Loop-----");
		 for(int i = 0 ; i<list.size(); i++) {
			list.get(i).getQuote();
			list.get(i).cancelInsurance();				
		 }		 
		 System.out.println("------Advanced Loop-----");
		 for(Insurance ins :list) {
			 ins.getQuote();
			 ins.cancelInsurance();
		 }
		 System.out.println("------With iterator-----");
		 Iterator <Insurance> tarator = list.iterator();
		 while(tarator.hasNext()) {
			 Insurance daList = tarator.next();
			 daList.getQuote();
			 daList.cancelInsurance();
		 }
	}
}
class Pet extends Insurance{
	String petType;
	Pet(String insuranceName , String petType){
		super(insuranceName);
		this.petType=petType;	
	}	
	@Override
	public void getQuote() {
		System.out.println(petType+" insurance quote is $50/ month with "+insuranceName);		
	}
	@Override
	public void cancelInsurance() {
		System.out.println("Cancel the "+insuranceName+" for "+petType);
		
	}	
}
class Car extends Insurance{
	String carModel;	
	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
	}		
	@Override
	public void getQuote() {
		System.out.println("Your insurance quote for "+carModel+" is $170/month with "+insuranceName);		
	}
	@Override
	public void cancelInsurance() {
		System.out.println("Go to "+insuranceName+" website to cancel "+carModel+" auto insurance.");		
	}	
}
class Health extends Insurance{
	public Health(String insuranceName) {
		super(insuranceName);
		
	}

	@Override
	public void getQuote() {
		System.out.println("You are qualified for free "+insuranceName);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("You better not cancel a free "+insuranceName);
		
	}
	
}
