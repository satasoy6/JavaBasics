package com.syntax.class29;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StoringDifferentObjects {

	public static void main(String[] args) {
	
		
		HashSet<Insurance>hset = new HashSet<>();
		hset.add(new Car("Geico", "BMW"));
		hset.add(new Pet("Meow","Cat"));
		hset.add(new Health("AmeriHealth"));
		
		System.out.println(hset.size());
		
		Iterator <Insurance> it = hset.iterator();
		while(it.hasNext()) {
		Insurance str = it.next();
		str.getQuote();
		str.cancelInsurance();
		System.out.println("-----------------------");
		}
		
		
	}
}
