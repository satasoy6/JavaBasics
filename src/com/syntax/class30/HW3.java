package com.syntax.class30;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HW3 {
	
	public static void main(String[] args) {
		
		//Print who gets the maximum salary
		
		Map<String,Integer> emp = new LinkedHashMap<>();
		
		emp.put("John Smith", 200000);
		emp.put("Will Smith", 500000);
		emp.put("Jada Smith", 400000);
		

		
		int max = emp.get("John Smith");
		
		Set<Entry<String,Integer>> entry = emp.entrySet();
		
		Iterator <Entry<String,Integer>> it = entry.iterator();
		while(it.hasNext()) {
			Entry<String,Integer> e = it.next();
			if(e.getValue()>max) {
				max=e.getValue();
				System.out.println(e.getKey()+" =$"+max);
			}

		
//		Integer maxSalary = Collections.max(emp.values());
//		
//		Set<Entry<String, Integer>> entry = emp.entrySet();
//		
//		Iterator <Entry<String, Integer>> it = entry.iterator();
//		while (it.hasNext()) {
//			Entry<String, Integer> ent = it.next();
//			if(ent.getValue()== maxSalary) {
//				System.out.println(ent.getKey()+" =$"+ent.getValue());
//			}
//		}
//		
			}
		
	}
	
}


