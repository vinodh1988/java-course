package com.daytwo;

public class Entity {
	String name;
     Entity(String name){
    	 this.name=name;
    	 System.out.println(hashCode()+" is created");
     }
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("deleted object is  "+hashCode()+"  "+name);
	}
    
    
    
}
