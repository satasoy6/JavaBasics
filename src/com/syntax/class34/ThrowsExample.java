package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
	
public static void main(String[] args) throws FileNotFoundException {

	multipleSleep();
	read("");
	
}
public static void read(String filePath) throws FileNotFoundException {
	FileInputStream fis = new FileInputStream(filePath);
}
public static void multipleSleep(){
	try {
		sleep();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//that method didn't want to handle the exception
	//now you are the caller of the method, do you want to handle it or throw it ?
}
public static void sleep() throws InterruptedException {
	//We can either handle the exception or select throws
	Thread.sleep(2000);
}//Exception will keep throwing until someone takes responsibilty

}
