package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {
		
		String file=System.getProperty("user.dir")+"/configs/configuration.properties";
		
		try {
		FileInputStream fis=new FileInputStream(file);//new FileNotFoundException();
		fis.close();
		Properties prop=new Properties();
		prop.load(fis);//new IO exception(); object created
		
		}//Always one exception will be executed
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am a finally block");
		}
		System.out.println("---End of the program---");
		
		//WE CAN HANDLE EVERY EXECPTION WITH "EXCEPTION" PARENT. THEN YOU CAN ONLY WRITE ONE EXCEPTION INSTEAD OF NESTED CATCH
		//if you will have multiple execption always go from the least generic to most generic
//		catch(IOException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
