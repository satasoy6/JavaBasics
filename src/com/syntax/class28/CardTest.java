package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {

	public static void main(String[] args) {		
		LinkedList <Card> cards = new LinkedList<>();		
		cards.add(new AMEX("American EXpress"));
		cards.add(new CitiBank("CitiBank"));
		cards.add(new Discover("Discover"));	
		System.out.println("------For Loop-----");		
		for(int i = 0 ; i<cards.size(); i++) {
			cards.get(i).ageLimit();
			cards.get(i).apply();
			cards.get(i).getLoan();			
			System.out.println("------------------------------------------");		
		}	
		System.out.println("------Advanced Loop-----");		
		for (Card c : cards) {
			c.ageLimit();
			c.apply();
			c.getLoan();
		System.out.println("------------------------------------------");
		}		
		 System.out.println("------With iterator-----");		 
		 Iterator<Card> it = cards.iterator();
		 while(it.hasNext()) {
			 it.next().ageLimit();
			 it.next().apply();
			 it.next().getLoan();
		 }
	}
}
