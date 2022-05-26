package com.sterling;

public class Increment {
  public static void main(String n[]) {
	  int a=20;
	  System.out.println(a++);//20
	  System.out.println(a); //21
	  
	  int b=20;
	  System.out.println(++b);//21
	  System.out.println(b); //21
	  
	  int c= ++a +b;// a++ + b; 
	  
	  boolean x=a++ >30 && b++ >5;
	  System.out.println(c);
	  
	  System.out.println(a+" "+b+" "+c);
  }
}
