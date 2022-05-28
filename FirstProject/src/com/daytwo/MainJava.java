package com.daytwo;

public class MainJava {
   public static void main(String n[]) {
	   Entity e=new Entity("a1");
	   Entity e1=new Entity("a2");
	   Entity e2=new Entity("a3");
	   Entity e3,e4,e5;
	   e3=e; 
	   e=new Entity("a4");
	   e2=new Entity("a5");
	   new Entity("a6");
	   e4=e5=new Entity("a7");
	   e3=e=e5;
	  
	   System.gc();
	   
   }
}

/*

   Garbage collector...
   
   It is a program/thread which executes in your
   runtime frequently ...the job of garbage collector is
   to remove the objects from the memory if the object
   does not have any references
*/