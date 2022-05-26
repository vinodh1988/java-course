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
  }
}
