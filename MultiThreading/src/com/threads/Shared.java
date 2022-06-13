package com.threads;

public class Shared {

	 public String SWITCH="Off";
	 public synchronized void logic(String name) throws InterruptedException{
		 SWITCH="On";
		 System.out.println("Started the job...!! "+name);
		 System.out.println("Waiting for the job to finish");
		 Thread.sleep(200);
		 System.out.println("Since the switch is "+SWITCH+" "+name+" operating the machine");
		 SWITCH="off";
		 System.out.println("Post processing the item");
		 Thread.sleep(500);
		 System.out.println(name+ " Job done");
		
	 }
}
