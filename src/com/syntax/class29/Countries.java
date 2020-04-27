package com.syntax.class29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Countries {

	public static void main(String[] args) {
		
		Set<String> country = new TreeSet<>();
		country.add("Turkey");
		country.add("USA");
		country.add("Italy");
		country.add("Albany");
		
		System.out.println(country);
		System.out.println("-----With Advanced Loop-----");
		for(String str : country) {
			System.out.println(str);
		}
		System.out.println("-----With Iterator------");
		Iterator<String> it = country.iterator();
		while(it.hasNext()) {
			it.next();
		}System.out.println(country);
	}
}
