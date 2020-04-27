package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Store {
	public static void main(String[] args) {
		
		Map <Integer, String> item =new TreeMap<>();
		item.put(76665, "Printer");
		item.put(13633, "HD TV");
		item.put(46576, "MAC");
		item.put(34241, "Airpods");
		System.out.println(item);
		
		Set<Entry<Integer,String>> products=item.entrySet();
		System.out.println(products);
		for (Entry<Integer, String> entry : products) {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}
		
		System.out.println("-----Iterator-----");
		
		Iterator<Entry<Integer, String>> it = products.iterator();
		while(it.hasNext()) {
			Entry<Integer, String> buy = it.next();
			String keyValue = buy.getKey()+" = "+buy.getValue();
			System.out.println(keyValue);
		}
		
	}

}
