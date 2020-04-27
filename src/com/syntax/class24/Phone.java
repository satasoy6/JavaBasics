package com.syntax.class24;

public abstract class Phone {
	
	//implemented methods
	
	public void call() {
		System.out.println("Phone can make a call");
	}
	public void text() {
		System.out.println("Phone can send text");
	}
	
	//unimplemented methods = undefined methods = abstract methods
	//This is %50 implementation because I have 2 methods implemented 2 unimplemented
	
	public abstract void takePicture();
	
	public abstract void playMusic();

}
class iPhone extends Phone {
	public void takePicture() {
		System.out.println("iPhones takes pictures");
	}
	
	public void playMusic() {
		System.out.println("Iphones play music using itunes");
	}
}

class Samsung extends Phone {
	
	public void takePicture () {
		System.out.println("Samsung takes pictures");
	}
	public void playMusic () {
		System.out.println("Samsung plays music using google store");
	}
}
