package com.threads;

public class First  extends Thread{
	int times;
	String name;
   public First(int times,String name) {
	   super(name);
	   this.times=times;
	   this.name=name;
	   start();
   }
   
   @Override
   public void run() {
	   try {
		Logics.logic1(times,name);
		System.out.println(getName()+" ENDED");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
