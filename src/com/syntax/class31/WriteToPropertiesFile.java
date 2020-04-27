package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//1. write into existing file and add values/ change / modify
		String filePath= "/Users/seymaatasoy/eclipse-workspace/JavaBasics/configs/Example.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		//2.load the data, pass that data back to the file
		//3. Create the object of the properties
		Properties prop=new Properties();
		prop.load(fis);//load the data
		//if you don't load first it will pretend it is like a new class and everything will be gone
		
		prop.setProperty("phoneNumber", "123456789");
		FileOutputStream fos = new FileOutputStream(filePath);
		prop.store(fos, "Added additional key");
	}
}
