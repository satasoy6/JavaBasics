package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task2 {

	public static List<Exception> getAllExceptions(){
		
		List<Exception> exceptionList = new LinkedList<>();
		
		//1 object of exception type
		int[] array= {1,2,3,4};
		try {
			System.out.println(array[6]);
		}
		catch(ArrayIndexOutOfBoundsException aob) {
			exceptionList.add(aob);
		}
		//2 Object of exception type
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException ae) {
			exceptionList.add(ae);
		}
		//3 Object of exception type
		String filePath="";
		try {
			FileInputStream fis=new FileInputStream(filePath);
		}
		catch(FileNotFoundException fne) {
			exceptionList.add(fne);
		}
		//4 Object of exception type
		try {
			int [] negArray=new int[-1];
		}catch(NegativeArraySizeException e) {
			exceptionList.add(e);
		}
		try {
			Object ob=new Double(50);
			Integer i=(Integer) ob;
		}catch(ClassCastException cce) {
			exceptionList.add(cce);
			
		}
		
		return exceptionList;
	}
	public static void main(String[] args) {
		
		List<Exception> list=getAllExceptions();
		System.out.println(list.size());
		
		Iterator<Exception> eit=list.iterator();
		while(eit.hasNext()) {
			String message=eit.next().getMessage();
			System.out.println(message);
		}
		
	}
}
