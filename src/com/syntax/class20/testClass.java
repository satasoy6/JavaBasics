package com.syntax.class20;

public class testClass {
	
	public static void main(String[] args) {
		
	employee emp = new employee ();
	emp.empId = 101;
	emp.salary = 90000;
	emp.getPaid();
	emp.work();
	
	System.out.println("------------------------------------");
	
	productOwner po = new productOwner ();
	//features accessible from grand parent
	po.empId = 123;
	po.salary = 120000;
	//po.ssn --> CE: private members of the class not available 
	//--> DO NOT PARTICIPATE I INHERITANCE
	po.company = "Syntax";
	po.ceremonies="Sprint Grooming, Sprint Planning, Sprint Demo, Daily Stand up";
	po.getPaid();
	po.attendMeetings();
	po.work();
	po.prioritizeBacklog();
	
	System.out.println("------------------------------------");	
	
	developer dev = new developer ();
	
	dev.empId = 134;
	dev.salary =102000;
	dev.company = "Syntax";
	dev.attendMeetings();
	dev.coding();
	dev.getPaid();
	
	
	
	
	}	
		
}
