package com.syntax.class17_1;


import com.syntax.class17.Employee;


public class AccessingMembersOfDifferentClass {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee ();
		emp.name="Ahmet";
		//below variables not available due to
		//emp.lastName --> protected
		//emp.ssn --> private
		//emp.salary-->default
		
		emp.method1();
		//below methods not available due to restrictions
		
		
		
		
	}
	
	

}
