package com.exceptions;

import java.util.Scanner;

public class MainClass {
  public static void main(String n[]) {
      Scanner sc=new Scanner(System.in);
	  try {
		 System.out.println("Enter a name");
		 String name = sc.next();
		 if(name.length()<3)
			 throw new NotValidException();
		ClassLoader.classLoader("com.exceptions.Sampe");
		  System.out.println("Class loaded");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NotValidException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  finally {
		  System.out.println("Mandatory logic");
	  }

  }
}
