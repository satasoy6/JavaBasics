package com.syntax.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Stores{
	
	String type, name;
	
	Stores(String type, String name){
		this.type=type;
		this.name=name;
		
	}
	public void display() {
		System.out.println("This is store : "+name);
	}
	public abstract void businessHours();
}
class Nike extends Stores {

	Nike(String type, String name) {
		super(type, name);
		
	}

	@Override
	public void businessHours() {
		System.out.println(name+" store's business Hours : 10am-6pm");
		
	}
	
}
class Costco extends Stores {

	Costco(String type, String name) {
		super(type, name);
		
	}

	@Override
	public void businessHours() {
		System.out.println(name+"'s business Hours : 9am-9pm");
		
	}
	
}
class Amazon extends Stores{

	Amazon(String type, String name) {
		super(type, name);
		
	}

	@Override
	public void businessHours() {
		System.out.println(name+" is open 24/7");
		
	}
	
}
public class UserDefinedClassesInMap {

	public static void main(String[] args) {
		
		//We want to store stores in form1 --> 1-Amazon, 2-Costco , 3-Nike
		Map<Integer, Stores> storeMap = new LinkedHashMap<>();
		storeMap.put(1, new Amazon("online","Amazon"));
		storeMap.put(2, new Costco("WholeSale","Costco"));
		storeMap.put(3, new Nike("Retail","Nike"));
	//	storeMap.put(3, new Nike("Shoe","Adidas")); we can add same object with same or without the same parameters
		
		System.out.println(storeMap);
//		To get an access to all methods of our Store OBjects : .values() ,keySet() , entrySet()
		
//		1.way --> get all Value objects		
		Collection<Stores>col = storeMap.values();
		for(Stores store:col) {
			store.businessHours();
			store.display();
			System.out.println("-------------");
		}
//		2.way --> get all entry Objects --> getValue()
		System.out.println("-------Using Entry Set-------");
		Set<Entry<Integer, Stores>> storeSet = storeMap.entrySet();
		for(Entry<Integer, Stores> entry : storeSet) {
			entry.getValue().businessHours();
			entry.getValue().display();
			System.out.println("----------------------------");
		}
//		3. way --> get all keys --> get value of specified key
		Set<Integer>keys = storeMap.keySet();
		for(Integer key: keys) {
		Stores element	= storeMap.get(key);
		element.display();
		element.businessHours();
		}
	}

}
