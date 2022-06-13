package com.multi;

public class ThreadY implements Runnable{
    Thread t;
	ThreadY(String name){
      t=new Thread(this,name);
      t.start();
    }
	@Override
	public void run() {
		while(true){
	System.out.println("Thread running!!!!"+t.getName());
	
	try {
		t.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
		
	}

}
