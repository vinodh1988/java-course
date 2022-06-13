package com.threads;

public class First  extends Thread{
   public First() {
	   super();
	   start();
   }
   
   @Override
   public void run() {
	   try {
		Logics.logic1();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
