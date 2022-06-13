package com.threads;

public class Second implements Runnable{
Thread thread;
int times;
String name;
  
   public Second(int times,String name) {
	   thread=new Thread(this,name);
	   thread.start();
	   this.times=times;
	   this.name=name;
   }
  
   public Thread getThread() {
	   return thread;
	   
   }
   public void run() {
	   try {
		Logics.logic2(times,name);
		System.out.println(thread.getName()+ " Thread Ended");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
