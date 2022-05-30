package com.def;

public interface Task {
    public void process();
    
    default public void postProcess() {
    	System.out.println("Default post process");
    };
}

/*

  if the interface has only one method which is abstract it is called 
function interface

  the concept of lambda is applicable only to functional interface

*/