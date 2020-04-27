package com.syntax.class19;

public class TeacherTest{
	
	
	public static void main(String[] args) {
		
	
	MathTeacher ayse = new MathTeacher();
	
	ayse.name = "Ayse";
	ayse.major= "Math teacher";
	ayse.age = 29;
	ayse.salary = 43000;
	ayse.schoolAddress = "123 Main ave";
	ayse.giveHomeWork();
	ayse.solveProblems();
	ayse.exam();
	ayse.teach();

	System.out.println("*******************************");
	
	ChemistryTeacher hilmi = new ChemistryTeacher ();
	
	hilmi.name = "Hilmi";
	hilmi.major= "Chemistry Teacher";
	hilmi.age = 28;
	hilmi.salary = 56000;
	hilmi.schoolAddress = "124 Main Ave";
	
	hilmi.doExperiments();
	hilmi.giveHomeWork();
	hilmi.teach();
	hilmi.exam();
	
	System.out.println("*******************************");
	
	PianoTeacher ezgi = new PianoTeacher();
	ezgi.name = "Ezgi";
	ezgi.major = "PianoTeacher";
	ezgi.age = 32;
	ezgi.salary = 30000;
	ezgi.schoolAddress = "125 Main Ave";
	
	ezgi.playInstrument();
	ezgi.giveHomeWork();
	ezgi.teach();
	
	
	}	
	
}
	
