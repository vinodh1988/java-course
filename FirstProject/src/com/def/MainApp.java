package com.def;

import java.util.Scanner;

public class MainApp {
  public static void main(String n[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your choice...");
	  String choice = sc.next();
	  Task t=null;
	  switch(choice) {
	  case "Documenting":
		     t=new Documentation();
		     break;
	  case "Coding":
		     t=new Coding();
		     break;
	  case "Building":
		     t=new Building();
		     break;
	  case "Testing":
		     t=new Testing();
		     break;
	  case "Anonymous":
		     t= new Task() {
		    	  public void process() {
		    		  System.out.println("Anonymous Class Process");
		    	  }
		     };
		     
	  case "Lambda":
		     t=()-> {
		    	System.out.println("Lambda implementation"); 
		     };
	  }
	  Perform.doThis(t);
  }
}
