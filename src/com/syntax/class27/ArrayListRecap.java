package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {
	public static void main(String[] args) {
		
		//let's create an arrayList that stores Double type of objects
		//1. generic collection / arraylist
		
		ArrayList<Double> alist = new ArrayList<>();
		alist.add(10.99);
		alist.add(12.90);
		alist.add(100.99);
		
		//alist.add("Hello"); can't store anything else other than double
		
		System.out.println(alist);
		
		System.out.println(alist.size());
		System.out.println(alist.isEmpty());
		alist.set(1, 13.90);//want to change alist[1] with 13.90
		
		System.out.println(alist);
		alist.remove(13.90);
		System.out.println(alist);
		alist.get(1);
		
		//retrieve all elements from collection
		
		//1. use enhanced for loop
		System.out.println("--------unboxing--------");
		for(double a : alist) {//unboxing will happen here
			System.out.println(a);
		}
		//2.regular for loop
		
		for(int i = 0; i<alist.size();i++) {
			double d = alist.get(i);
			System.out.println(d);
		}
		
		//3.iterator
		Iterator<Double> iterator=alist.iterator();//this method returns 
		while(iterator.hasNext()) {
			double d = iterator.next();//automatic unboxing happens
			System.out.println(d);
		}
		
		System.out.println("--------Non generic collection--------");
		//2.non generic collection / arraylist
		
		ArrayList obj = new ArrayList();
		obj.add("hello");
		obj.add(100);
		obj.add('c');
		obj.addAll(alist); // store collection object		
		
		System.out.println(obj);
		
		//retrieve all elements from collection
		
		for(Object o : obj) {
			System.out.println(o);
		}
		
		
	}

}
