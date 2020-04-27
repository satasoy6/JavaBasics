package com.syntax.class19;

public class PianoTeacher extends Teacher{

	String instrument;
	String environment ; 
	
	public void playInstrument()
	{
		instrument = "piano";
		environment = "conservatory";
		System.out.println(major+" "+name+" plays "+instrument+" in the "+environment+" at "+schoolAddress);
		System.out.println(major+" "+name+" earns "+salary+" annually");
	}
}
