package com.syntax.class19;

public class ChemistryTeacher extends Teacher{

String environment;

public void doExperiments() {
	environment = "laboratory";
	System.out.println(major+" "+ name+" does some experiments "+environment+" at "+schoolAddress);
	System.out.println(major+" "+name+" earns "+salary+" annually");
}
}