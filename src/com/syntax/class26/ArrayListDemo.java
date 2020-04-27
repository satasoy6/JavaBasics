package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		//create an arraylist with names
		
		ArrayList<String> arrayList = new ArrayList<>();
		//adding string object into arraylist
		arrayList.add("John");
		arrayList.add("Gulbahar");
			
		//access element from arrayList
		
		String secondElement=arrayList.get(1);
		System.out.println(secondElement);
		
		//Arraylist is a dynamic array
		arrayList.add("Jane");
		arrayList.add("John");
		
		//How many elements we stored
		
		int size = arrayList.size();
		System.out.println(size);
		
		arrayList.add("Hichem");
		System.out.println(arrayList.size());
		
		arrayList.remove("John");
		System.out.println(arrayList.size());
		
		arrayList.add("Hichem");
		System.out.println(arrayList);
		
		arrayList.set(1,"Ahmed");
		System.out.println(arrayList);
		
		System.out.println("------------Regular loop------------------");
		
		//how to retrieve values from arraylist one by one?
		
		
		for (int i = 0; i<arrayList.size();i++) {
			String element = arrayList.get(i);
			System.out.println(element);
		}
		System.out.println("-------------Advanced Loop-----------------");
		
		for (String str : arrayList) {
			System.out.println(str);
		}
	}
}
