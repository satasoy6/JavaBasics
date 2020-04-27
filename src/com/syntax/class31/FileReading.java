package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
		String filePath = "/Users/seymaatasoy/eclipse-workspace/JavaBasics/configs/configuration.properties";
		System.out.println(filePath);
		//for everyone to be able to access to the file
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		String username = System.getProperty("user.name");
		System.out.println(username);
		
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		String filePath1 = System.getProperty("user.dir")+"/configs/Example.properties";
		FileInputStream fis = new FileInputStream(filePath1);
		
		Properties prop = new Properties ();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
	//	System.out.println(browser);
		
		String url = prop.getProperty("url");	
	//	System.out.println(browser);
		System.out.println(url);
		
//		FileOutputStream fos = new FileOutputStream(filePath);
//		prop.store(fos, "New keys added");
		
		
	}
}
