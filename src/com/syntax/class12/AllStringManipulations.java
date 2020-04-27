package com.syntax.class12;

public class AllStringManipulations {

	  public static void main (String[]args){
		   
//		   /*=========================STRING MANIPULATION============================*
//		   
//		   String initialization:
//		   A String object is immutable. Once it is created, its contents cannot be changed
//		   Because Strings are immutable and frequently used, Java has a shorthand initializer
//		   for creating a String
//		   **/
		   System.out.println("===========String initialization:!===========");
//		   String bootCamp = "Batch VI";
//		   System.out.println(bootCamp);
//		   
//		   
//		   /*
//		   Instantiating a String Object:
//		   You can instantiate a String object from a string value or from an array of characters
//		   To create a String from a string literal, use the following:*/
//		   System.out.println("===========Instantiating a String Object:===========");
//		   System.out.println(); 
//		   
//		   
//		   String str007 = new String("This is a String");
//		   System.out.println(str007);
//		   
//		   System.out.println("===========Array of characters:===========");
//		   System.out.println(); 
//		   /*
//		   Array of characters:
//		   */
//		   char data[] = {'h', 'e', 'l', 'l', 'o'};
//		  
//		   for(int x =0;x<data.length;x++){
//		      System.out.print(data[x]+" ");
//		   }  
//		   
//		   
//		   
//		   
//		  
//		    System.out.println("===========reate a String from an array of characters===========");
//		    System.out.println();  
//		    // To create a String from an array of characters, use the following:
//		   
//		   String stra = new String(data);
//		   System.out.print(stra+" ");
//		   
//		  
//		​
//		   System.out.println("****************String toLowerCase() Method****************");
//		   System.out.println();
//		   /* 
//		      Sting toLowerCase()
//		      Description:
//		      This method converts all of the characters in this String to lowercase
//		   */
//		   
//		      String lowCase = new String("Welcome to String Minipulation Techniques");
//		      System.out.print("Now converting to lower case :");
//		      System.out.println(lowCase.toLowerCase());
//		 
//		   System.out.println("****************String toUpperCase() Method****************");
//		   System.out.println();
//		   /*
//		      Sting toUpperCase()
//		      Description:
//		      String toUpperCase()
//		      This method converts all of the characters in this String to Uppercase
//		   */
//		      String upCase = new String("welcome to string manipulation techniques");
//		      System.out.print("Now converting to Uper case :");
//		      System.out.println(upCase.toUpperCase());
//		  
//		   System.out.println("****************String equals() Method****************");
//		   System.out.println();
//		   /* 
//		      boolean equals(Object anObject)
//		      Description:
//		      This method compares this String to another String. 
//		      The result is true only if the argument is not null and if a String object that
//		      represents the same sequence of characters as this object.
//		   */
//		      String s1 ="ABC";
//		      String s2= "abc";
//		      System.out.println("The return value is : "+s1.equals(s2));
//		      boolean check=s1.equals(s2);
//		   //OR assigning it to a boolean and evaluate the boolean value in IF ELSE condition
//		      if(check){
//		         System.out.println("Values are equal");
//		      }else{
//		         System.out.println("Values are not equal");
//		      }
//		   
//		   System.out.println("****************String equalsIgnoreCase() Method ****************");
//		   System.out.println();
//		   /*   
//		   boolean equalsIgnoreCase(String anotherString)
//		   Description:
//		   This method compares this String to another String, ignoring case considerations.
//		   Two strings are considered equal ignoring case if they are of the same length, and
//		   corresponding characters in the two strings are equal ignoring case.
//		   */
//		      String s3 ="ABC";
//		      String s4="abc";
//		         System.out.println("The return value is : "+s3.equalsIgnoreCase(s4));
//		         
//		      //OR assigning it to a boolean and evaluate boolean value in IF ELSE condition
//		      boolean check1=s3.equalsIgnoreCase(s4);
//		      if(check){
//		         System.out.println("Values are equal");
//		      }else{
//		         System.out.println("Values are not equal");
//		      }
//		   
//		   System.out.println("****************String contains() Method****************");
//		   System.out.println();
//		   /*
//		   boolean contains(String anotherString)
//		   Description:
//		   This method searches the sequence of characters in the string. 
//		   If the sequences of characters are found, then it returns true otherwise returns false.
//		  */
//		  
//		   String cn="Hello friends! My name is John";
//		   System.out.println("The return value is : "+cn.contains("John"));
//		   boolean cont=cn.contains("name");
//		     if(cont){
//		      System.out.println("The string contains name");
//		   }else{
//		      System.out.println("The string doesn not contain name");
//		   }
//		   
//		   System.out.println("****************String startsWith() Method****************");
//		   System.out.println();
//		   /*
//		   boolean startsWith(String prefix)
//		   Description:
//		   this method checks if a string starts with a specific prefix
//		   */
//		   String str="Hello friends! My name is John";
//		   System.out.println("Return value is "+str.startsWith("Hello"));
//		​
//		   System.out.println("****************String endsWith() Method****************");
//		   System.out.println();
//		   /*
//		   boolean endsWith(String prefix)
//		   Description:
//		   This method checks if a ends with a specific suffix.
//		   */
//		   
//		   String end="Hello friends! My name is John";
//		   System.out.println("Return value is "+end.endsWith("John"));
//		   
//		   
//		   System.out.println("****************String isEmpthy() Method****************");
//		   System.out.println();
//		   /*
//		   boolean isEmpty()
//		   Description:
//		   This method checks whether a String is empty or not.
//		   This method returns true if the given string is empty, else it returns false.
//		   
//		   */
//		   String empty="";
//		   
//		   System.out.println("This method will return "+empty.isEmpty());
//		   //using it in if condition
//		   if(empty.isEmpty()){
//		      System.out.println("String is empty");
//		   }else{
//		      System.out.println("String is not empty");
//		   }
//		   //OR assign it to a boolean and evaluate the boolean value in IF ELSE condition
//		   boolean emp=empty.isEmpty();
//		    if(emp){
//		      System.out.println("String is empty");
//		   }else{
//		      System.out.println("String is not empty");
//		   }
//		   
//		   
//		   System.out.println("****************String concat() Method****************");
//		   System.out.println();
//		   /*
//		   Description:
//		   String concat(String str)
//		   This method appends one String to the end of another. 
//		   The method returns a String with the value of the String passed 
//		   in to the method appended to the end of the String used to invoke this method.
//		   */
//		   
//		   String conc="Strings are immutable";
//		   conc=conc.concat(" all the time");
//		   System.out.println(conc);
//		   
//		   
//		   System.out.println("****************String trim() Method****************");
//		   System.out.println();
//		   /*
//		   String trim();
//		   Description:
//		   This method returns a copy of the string,
//		   with leading and trailing whitespace omitted.
//		   */
//		   
//		   
//		   String tr=" Trim this String ";
//		   System.out.println(tr);
//		   System.out.println(tr.trim());
//		   
//		   
//		   System.out.println("****************String charAt() Method****************");
//		   System.out.println();
//		   /*
//		   String charAt()
//		   Description:
//		   This method returns the character located at the String's specified index.
//		   The string indexes start from zero.
//		   */
//		   
//		   String chAt = "Find this string's characters";
//		   System.out.println(chAt.charAt(8));
//		   
//		   //Print the entire characters of the string using charAt() method.
//		   for (int c=0;c<chAt.length();c++){
//		      System.out.print(chAt.charAt(c)+" ");
//		   
//		   }
//		    
//		   
//		   System.out.println("****************int indexOf() Method****************");
//		   System.out.println();
//		   /*
//		   int indexOf(int ch)
//		   Description:
//		   This method returns the index within this string of the first
//		   occurrence of the specified character or -1 if the character does not occur.
//		   */
//		   String Str = new String("Welcome on Board");
//		   String SubStr1 = new String("Tutorials"); 
//		   String SubStr2 = new String("Sutorials");
//		   String SubStr3 = new String("Tutorials");
//		   
//		   System.out.print("Found Index :" ); 
//		   System.out.println(Str.indexOf( 'o' ));
//		   
//		   System.out.print("Found Index :" );
//		   System.out.println( Str.indexOf( SubStr1 ));
//		   
//		   System.out.print("Found Index :" );
//		   System.out.println(SubStr1.indexOf( SubStr3 ));
//		   
//		   
//		   System.out.println("****************String substring() Method****************");
//		   System.out.println();
//		   /*
//		   String substring(int beginIndex, int endIndex)
//		   Description:
//		   This method returns a new string that is a substring of this string.
//		   */
//		   
//		   String subS="Fight COVID-19 Wash your Hands!";
//		   System.out.println(subS.substring(14));
//		   System.out.println(subS.substring(0,13));
//		   
//		   System.out.println("****************String replace() METHOD****************");
//		   System.out.println();
//		   /*
//		   
//		   Description:
//		   String replace(char oldChar, char newChar)
//		   This method returns a new string resulting from replacing all occurrences of oldChar
//		   in this string with newChar.
//		   */
//		   String repl="Replace az with bz aaaa";
//		   System.out.println(repl);
//		   System.out.println(repl.replace('a','b'));
//		   
//		   System.out.println("****************String replaceAll() METHOD****************");
//		   System.out.println();
//		   /*
//		   Description:
//		   This method replaces each substring of this string that matches the
//		   given regular expression with the given replacement.
//		   
//		   [A-Z] will look for all character from A-Z in the string
//		   [a-z] will look for all character from a-z in the string
//		   [0-9] will look for all numbers from 0-9 in the string
//		   [^abc] will look for any character except a, b, or c in the string
//		   */
//		   String mix="AAbbcddXXy89668$%#!@#$%^&***";
//		   System.out.println(mix.replaceAll("[A-Z]",""));
//		   System.out.println(mix.replaceAll("[a-z]",""));
//		   System.out.println(mix.replaceAll("[0-9]",""));
//		   System.out.println(mix.replaceAll("[^A-Za-z0-9]",""));
//		   
//		   System.out.println("****************String split() METHOD****************");
//		   System.out.println();
//		   /*
//		   String[] split(String regex)
//		   Description:
//		   This method splits this string around matches of the given regular expression.
//		   
//		   w can you find how many words are in the string?
//		   
//		   Using space “ ” as a delimiter
//		   Split returns an array of Strings
//		   */
//		   
//		   
//		   String subject="I love String methods and I want to learn more";
//		   //making an array of String
//		   String [] splittedSub = subject.split(" ");
//		   System.out.println(splittedSub.length);
//		   //Looping through the array to get all the values 
//		   for (int i = 0; i< splittedSub.length; i++) {
//		      System.out.println(splittedSub[i]);
//		   }
//		   
//		   
//		   
//		   System.out.println("****************String compareTo() METHOD****************");
//		   System.out.println();
//		   /*
//		   
//		   The String Class: Lexiographical 
//		   Description:
//		   Sometimes you need to compare two Strings to see which comes first alphabetically
//		      
//		      * In Java, it is based on the Unicode value of each character 
//		      (http://unicode-table.com/en/)
//		      --> 0-9 comes before A-Z which comes before a-z (Remember, Java is case-sensitive!)
//		      
//		      * Use compareTo() or compareToIgnoreCase()
//		      --->Methods return one of the following:
//		      
//		      * Negative Integer: The contents of the first String are lexicographically before
//		       the second String
//		      *  0: The contents of the first String are lexicographically equal to the second String
//		      *  Positive Integer: The contents of the first String are lexicographically after the second String
//		​
//		   */
//		   
//		   String lex1 = "ABC";
//		   String lex2 = "abc";
//		   String lex3 = "DEF";
//		   String lex4 = "def";
//		   String lex5 = "abc";
//		   
//		   System.out.println("lex1 is lexoGraphically before lex2 so the value is"+
//		      " negative : "+lex1.compareTo(lex2));
//		   System.out.println("lex1 is lexoGraphically before lex3 so the value is"+
//		      " negative : "+lex1.compareTo(lex3));
//		   System.out.println("lex1 is lexoGraphically before lex4 so the value is"+
//		      " negative : "+lex1.compareTo(lex4));
//		    System.out.println("lex1 is lexoGraphically before lex5 so the value is"+
//		      " negative : "+lex1.compareTo(lex5));
//		   System.out.println("lex2 is lexoGraphically before lex1 so the value is"+
//		      " positive : "+lex2.compareTo(lex1));  
//		   System.out.println("lex1 ignoreCase is lexoGraphically equals to lex5 so the value is"+
//		      " zero : "+lex1.compareToIgnoreCase(lex5)); 
//		   System.out.println("lex2  is lexoGraphically equal to lex5 so the value is"+
//		      " zero : "+lex2.compareTo(lex5));    
//		        
//		   if(lex1.compareTo(lex2)<0){
//		         System.out.print("s1 is lexogrpahically before s2");
//		      }else{
//		         System.out.println("s1 is lexogrphically equal to s2");
//		   }
//		​
//		 
//		   
//		         
		   }
//	  
//
}
//
//
