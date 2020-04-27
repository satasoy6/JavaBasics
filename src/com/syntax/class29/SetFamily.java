package com.syntax.class29;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;
public class SetFamily {
	public static void main(String[] args) {
		//hashSet doesn't guarantee insertion order
		Set<String> veggies = new HashSet<>();
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("cucumber");
		
		System.out.println(veggies);
		//LinkedHashSet guarantee insertion order
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("totamo");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("tomato");
		
		System.out.println(fruits);
		
		//tree set stores objects in ascending order
		Set <String> food = new TreeSet<>(veggies);
	//	food.addAll(veggies); instead of typing veggies inside TreeSet method we can add veggies like that too.
		food.addAll(fruits);
		System.out.println(food);
	}
	

}
