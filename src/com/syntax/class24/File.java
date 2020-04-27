package com.syntax.class24;

public abstract class File {
	
	public abstract void open() ;
	
	public void edit() {
		
		System.out.println("Edit");
	}
	public void close() {
		System.out.println("Close");
	}

}
class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("To open .java file you need nopepad++ to be installed");
		
	}
	
}
class WordFile extends File{

	@Override
	public void open() {
		System.out.println("To open a word file you need microsoft word to be installed");
	}
	
}
class PDFFile extends File{

	@Override
	public void open() {
		System.out.println("To open pdf file you need adobe to be installed");
		
	}
	
}


