package com.syntax.class29;
import java.util.*;
public class Cities {
	
	public static void main(String[] args) {
		
		Set<String> city = new LinkedHashSet<>();
		city.add("Jersey City");
		city.add("Atlantic City");
		city.add("Cape May City");
		city.add("Ocean City");
		city.add("Albany City");
		city.add("New York City");
		
		System.out.println(city);
		
		Iterator <String> cty = city.iterator();
		while(cty.hasNext()) {
			String c = cty.next();
			if(c.startsWith("A")) {
				cty.remove();
			}
		}System.out.println(city);
		
	}

}
