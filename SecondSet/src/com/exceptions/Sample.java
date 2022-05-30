package com.exceptions;

import java.sql.SQLException;
import java.util.Scanner;

public class Sample {
  public static void main(String n[]) {
	Scanner sc=new Scanner(System.in);
	 try {
	  System.out.println(n[0]);
	  System.out.println(n[2]);
	  System.out.println("Enter two integers");
	    int a= Integer.parseInt(sc.next());
	    int b= Integer.parseInt(sc.next());
	    System.out.println(a/b);
	  System.out.println("Enter a class name with package name to load it");
	  Class.forName(sc.next());
	}
	catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	catch(NullPointerException e) {
		System.out.println("Null pointer exception");
	}
	catch(ClassNotFoundException e) {
	   System.out.println("Class Not Found Exception");
	}
	 
	catch(RuntimeException e) {
		System.out.println("Runtime exception occured and its type is"+e.getClass().getName());
	}
	 
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	  System.out.println("Some other logic");
  }
}


/*
   Problems that occur during runtime are called as Exceptions
   
   and the runtime problems may be due to 
   
   1. Logical issues
  Anticipatable
  
   2. Hardware issues
   3. Software issues [connectivity,availability]
   
   Unchecked exceptions 
                 subclasses for runtime exceptions
                 
   checked exceptions
                      direct subclasses of Exception
                      
                     
         if exceptions  not handled...it terminates the program abruptly
         
         so to avoid that we need to handle it
         
         to handle exceptions , we use five keywords in java
         
         try
         throw
         catch
         throws
         finally
                      
                      

*/