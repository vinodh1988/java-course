package com.daytwo;

public class StaticStore {
  static {
	System.out.println("Static block");  
  }
  
  {
	  System.out.println("LOCAL BLOCK"+hashCode());
  }
  StaticStore(){
	  System.out.println("Static Store instantiated "+hashCode());
  }
  public static void callMe() {
	  System.out.println("CallMe static method called");
	  
  }
  
  public void callIt() {
	  System.out.println("Instance method called");
  }
}
