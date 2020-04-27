package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.syntax.class27.Food;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> llist  = new LinkedList<>();
		llist.add("Yunus"); // comes from collection
		llist.add(0, "Reyhan");//comes from List
		llist.add("Pavel");
		llist.add("Farid");
		System.out.println(llist.size());
		
		//get all elements one by one 3 different ways
		System.out.println("--------Regular for loop--------");
		for(int i = 0 ; i<llist.size();i++) {
			System.out.println(llist.get(i));
		}
		
		System.out.println("------Advanced for loop---------");
		for(String l : llist) {
			System.out.println(l);
		}
		System.out.println("---------Iterator----------");
		Iterator<String> it = llist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Can we store objects of user defined classes?
		
	//	LinkedList<Food> food = new LinkedList<>();
		List<Food> food = new LinkedList<>();
		
		
		
	}
}
