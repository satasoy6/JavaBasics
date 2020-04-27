package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class HW5 {

	public static void main(String[] args) {
		ArrayList<Integer> yesDup = new ArrayList<>();
		
		yesDup.add(10);
		yesDup.add(20);
		yesDup.add(30);
		yesDup.add(40);
		yesDup.add(40);
		yesDup.add(30);
		yesDup.add(20);
		yesDup.add(10);
		int total=0;
		for(int i=0;i<yesDup.size();i++) {
			total+=yesDup.get(i);
		}System.out.println("Total of all numbers with regular for loop = "+total);
		
		int sum = 0;
		for(Integer num : yesDup) {
			sum+=num;
		}System.out.println("Total of all numbers with advanced loop= "+sum);
		
		int sum2 = 0;
		Iterator<Integer> it = yesDup.iterator();
		while(it.hasNext()) {
			sum2+=it.next();
		}System.out.println("Total of all number with iterator ="+sum2);
	}
}
