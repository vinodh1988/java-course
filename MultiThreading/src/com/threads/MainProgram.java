package com.threads;

public class MainProgram {
    public static void main(String n[]) {
    	
    	First f=new First(25,"First Thread");
    	Second s=new Second(15,"Second Thread");
    	try {
			f.join();
			First f1=new First(10,"First Second Copy");
			s.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	Second s1=new Second(10,"Second Second copy");
    
    }
}
