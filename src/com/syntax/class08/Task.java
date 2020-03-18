package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		
		
		/*Create an array of animals and store 6 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
		
		
		
		String [] animals = {"little lamb","big giraffe","camel","rhinoceros","kangaroo","monkey"};
		
		for (int i = 0; i<animals.length;i++) {
			System.out.println(animals[i]);
		}
		
		System.out.println("***********************");
		for (String animal : animals) {
			if (animal.equals("little lamb")) {
				System.out.println(animal);
			}else {
				System.out.println(animal);
			}
		}
	}

}
