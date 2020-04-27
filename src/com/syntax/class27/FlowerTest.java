package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {
	
	public static void main(String[] args) {
		
		
		//Flowers into array
		Flower [] flowerArray = {new Tulip("Tulip"),new Rose("Rose"), new Sunflower("Sunflower")};
		
		//Flowers into arrayList
		
		ArrayList<Flower>flowers=new ArrayList<>();
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));
	//	flowers.add("Rose"); cannot add String object into arraylist of flower objects
		System.out.println("---------ADVANCED FOR LOOP---------");
		for(Flower a : flowers) {
			a.bloom();
		}
		System.out.println("--------WITH ITERATOR--------");
		//With iterator
		Iterator<Flower> it =flowers.iterator();
		while(it.hasNext()) {
		it.next().bloom();
		}
		
		
	
	}

}
