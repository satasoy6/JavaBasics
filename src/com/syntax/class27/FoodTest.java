package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	
	public static void main(String[] args) {
		
		ArrayList<Food> meals = new ArrayList<>();
		meals.add(new Makarna("Makarna","Pasta",300));
		meals.add(new Kebab("Kebab","Lamb",200));
		meals.add(new Menemen("Menemen","Eggs",150));
		meals.add(new Manti("Manti","Dough",450));
		
		System.out.println("******Regular For Loop******");
		
		for(int i = 0 ; i<meals.size(); i++) {
			meals.get(i).boil();
			meals.get(i).cook();
			meals.get(i).grill();
			System.out.println("-----------------");
		}
		
		System.out.println("******Advanced Loop******");
		
		for(Food f : meals) {
			f.boil();
			f.cook();
			f.grill();
			System.out.println("-----------------");
		}
		
		System.out.println("******Iterator******");
		
		Iterator <Food> m = meals.iterator();
		while(m.hasNext()) {
			Food x = m.next();
			x.boil();
			x.cook();
			x.grill();
			System.out.println("-----------------");	
			
		}
	}
}
