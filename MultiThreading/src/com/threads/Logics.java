package com.threads;

public class Logics {
   public static void logic1(int times,String name) throws InterruptedException {
	   int i=0;
	  while(i<times) {
	   System.out.println("Doing the job of logic1 for "+name);
	   Thread.sleep(100);
	   i++;
	  }
   }
   
   public static void logic2(int times,String name) throws InterruptedException{
	  int i=0;
	   while(i<times) {
		   System.out.println("Doing the job of logic2 "+name);
		   Thread.sleep(500);
		   i++;  
	   }
   }
}
