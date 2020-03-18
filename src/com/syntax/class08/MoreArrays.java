package com.syntax.class08;

public class MoreArrays {

	public static void main(String[] args) {
		
		
		String[] students= new String[3];
		//arrays are fixed in size
		
		//if we add more values than we declare-=->
		//array index out of bounds exception
		
		
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
		//students[3]="Aaron";-->during run time java machine will give 
								//array index out of bounds exception
		
	//	System.out.println(students[3]);
		
		//if we store more elements than we declare
		//compiler will add default values
		
		
		String [] inClassStudents = new String[5];
		inClassStudents[0]="Hichem";
		inClassStudents[2]="Tetteh";
		inClassStudents[3]="Hichem";
		inClassStudents[4]="Tetteh";
		inClassStudents[5]="Hichem";
		
		
		
		System.out.println(inClassStudents[5]);

	}

}
