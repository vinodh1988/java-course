package com.multi;

public class ThreadX extends Thread {
	public ThreadX(String name){
		super(name);
		start();
	}
@Override
	public void run(){
		
		while(true){
			System.out.println("Thread X is running!"+getName());
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
