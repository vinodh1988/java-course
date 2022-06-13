package com.threads;

public class Second implements Runnable{
Thread thread;
   public Second() {
	   thread=new Thread(this);
	   thread.start();
   }
   
   public void run() {
	   try {
		Logics.logic2();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
