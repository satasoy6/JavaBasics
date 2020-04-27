package com.syntax.class29;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		//hashMap doe
		
		HashMap<String,String> hmap = new HashMap<>(); // interface // upcasting
//		to store calues into Map we use put
		
		hmap.put("Name", "John");
		hmap.put("Last Name", "Smith");
		hmap.put("Address","123 Main");
		hmap.put("City", "Chantilly");
		
//		 How to check if map has any values
		boolean isEmpty = hmap.isEmpty();
		System.out.println("Is Map empty ?="+isEmpty);
		
//		How many elements are in the Map?
		int size = hmap.size();
		System.out.println("The number of elements ="+size);
		
//		can we add more values into map?
		hmap.put("Zip", "12345");
//		can we store duplicate keys? NO, previous value will be replaced		
		hmap.put("Name", "Jane");//it reassigns,overrides it.
		System.out.println(hmap);

//		How to access the value ?	-> We use method get and spesify the key	
		System.out.println(hmap.get("Name"));
		
//		How to remove the value
		hmap.remove("Address");
		System.out.println(hmap);
		
//		replace values in map
		hmap.replace("Zip", "94534");
		System.out.println(hmap);
		
	}
}
