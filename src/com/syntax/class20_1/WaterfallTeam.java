package com.syntax.class20_1;

import com.syntax.class20.employee;

public class WaterfallTeam extends employee {

	
	public static void main(String[] args) {
		
		WaterfallTeam wteam = new WaterfallTeam();
		WaterfallTeam.company = "Syntax";
		wteam.empId = 124;
	//	wteam.salary is not available to me. default is not visible
	//	protected variables are visible to the child class in different package
	}
}
