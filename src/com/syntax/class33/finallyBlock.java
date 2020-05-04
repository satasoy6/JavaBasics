package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class finallyBlock {

	public static void main(String[] args) {
		
		String file=System.getProperty("user.dir")+"/configs/configuration.properties";
		
		try {
			FileInputStream fis=new FileInputStream(file);//new FileNotFoundException();
		}
		catch(FileNotFoundException e) {
			System.out.println("I am a catch block");
		}finally {
			System.out.println("I am a finally block");
		}
	}
	
	
}
