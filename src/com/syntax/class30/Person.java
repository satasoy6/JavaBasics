package com.syntax.class30;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Person {

	
	private String name;
	private String lastName;
	private double salary;
	
	public Person(String name, String lastName, double salary) {
		//super();
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
	}
	public void userDetails() {
		System.out.println(name+" "+lastName+" Salary is = "+salary);
		
	}
	
	public static void main(String[] args) {
		
		Map<Integer, Person> person = new TreeMap<>();
		person.put(7890, new Person("Gulbahar","Kayabay",95000));
		person.put(1234, new Person("Seyma","Atasoy",90000));
		person.put(5678,  new Person("Ayse","Ozkan",98000));
			
	System.out.println("***KeySet***");
		Set<Integer> keys = person.keySet();
		
		for(Integer entry : keys) {
			Person element = person.get(entry);
			element.userDetails();
			System.out.println("-----------------------------------------------------");
			
		}
		
	System.out.println("***Using Collection***");
		Collection<Person> col = person.values();
		for(Person p :col) {
			p.userDetails();
			System.out.println("-----------------------------------------------------");
		}
		
	System.out.println("***Using Entry Set***");
		Set<Entry<Integer, Person>> personSet = person.entrySet();
		for(Entry<Integer, Person> entries : personSet) {
			entries.getValue().userDetails();
			System.out.println("-----------------------------------------------------");
			}
		
		
	}
}
