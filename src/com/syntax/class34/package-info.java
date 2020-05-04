package com.syntax.class34;
/*checked Exceptions: FileNotFound, IOException, InterruptedException
 * unchecked: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundException,StringIndexOutOfBoundsException
 * 
 * Keywords associated with Exception:
 * try --block that contains problematic code/code that might throw an exception
 * catch --block that catches an exception(We can have multiple catches)
 * finally --
 * 
 */












//What is the difference between finally {} vs final vs finalize()
//finally is a block that associated with try block and final is a keyword and it is a non access modifier that is
//associated with class, method or variable
//Final: class couldn't be inherited, final method couldn't be overridden.final variable could not be changed/ CONSTANT

//Finalize() is a method associated with garbage collection process. This method is executed before object gets destroyed
//from a heap memory

// throws - keyword used for handling checked exception as using throws ww can declare an exception


//Functions:

//We need a method to initialize and open browser --> base class
//We need a method to read and extract properties --> ConfigsReader

//in the future:
//	to handle excel--> Excel
//	to perform any action on the browser --> common functions
