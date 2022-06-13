package com.threads;

public class Logics {
   public static void logic1() throws InterruptedException {
	  while(true) {
	   System.out.println("Doing the job of logic1");
	   Thread.sleep(100);
	  }
   }
   
   public static void logic2() throws InterruptedException{
	   while(true) {
		   System.out.println("Doing the job of logic2");
		   Thread.sleep(500);
		  }
   }
}
