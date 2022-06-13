package com.threads;

public class JobThread extends Thread {
  Shared shared;
  
  public JobThread(String name,Shared shared) {
	  super(name);
	  this.shared=shared;
	  start();
  }
  
  public void run() {
	  System.out.println(getName()+" Thread Started");
	  try {
		shared.logic(getName());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
