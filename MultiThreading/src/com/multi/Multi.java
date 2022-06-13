package com.multi;

public class Multi {
   
	public static void main(String n[]){
		System.out.println("Main started");
		ThreadX obj=new ThreadX("Green");
		
		ThreadX obj1=new ThreadX("Blue");
		ThreadY obj2=new ThreadY("Yellow");
		obj1.setPriority(Thread.MAX_PRIORITY);
		
		new Thread(new Runnable(){
			public void run(){
				
			while(true){
				System.out.println("Thread X is running!"+"Orange");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
				
			}
		},"Orange").start();
		
		Runnable r=()->{
			
			while(true){
				System.out.println("Thread X is running!"+"Magenta");
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		};
		
		new Thread(r).start();
		
	
		System.out.println("Nothing more to do in main");
	}
}
