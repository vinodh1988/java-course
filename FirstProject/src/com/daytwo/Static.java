package com.daytwo;

public class Static {
  private int sno;
  private static int instanceCount;
  
  public Static() {
	  sno=++instanceCount;
  }
  /*
   * in a static context, only static members 
   * can be called
   * 
   * in a non static context, can access both non static and
   * static members
   */
  public static void instancesSoFar() {
	  System.out.println("Instances so far"+instanceCount);
  }
  
  public void info() {
	  System.out.println("Sno::"+sno);
	  System.out.println("Total number of instance"+instanceCount);
  }
}
