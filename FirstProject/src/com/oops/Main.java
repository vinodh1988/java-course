package com.oops;

public class Main {
  public static void main(String[] args) {
	  Student s=new Student();
	 s.show();
	 
	 //s.sno=1;
	 //s.name="Rajeev";
	 //s.city="Chennai"; // not a good practice
	              //you should not allow variables
	             //to be accessed outside the class
	 s.setStudent(1, "Ram", "Mumbai");
	 s.show();
	 s.setStudent(34);
	 s.show();
  }
}


/*
  Constructor is a special method in java
  
  Which is used to create objects...
  
  constructor without any parameters is created by default
  in java...this is called default constructor
  
  constructor will not have return types
  
  constructors can be overloaded [polymorphism]
  
  operator overloading...is not supported in java...
  
  
*/