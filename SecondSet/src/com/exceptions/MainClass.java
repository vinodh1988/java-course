package com.exceptions;

public class MainClass {
  public static void main(String n[]) {
	  try {
		ClassLoader.classLoader("com.exceptions.Sampe");
		  System.out.println("Class loaded");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  finally {
		  System.out.println("Mandatory logic");
	  }

  }
}
