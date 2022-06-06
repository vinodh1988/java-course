package com.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Testing implements Activity {
	@Autowired
	List<Process> process;
	
	{
		System.out.println("Testing..object created");
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
           System.out.println("Testing the application ....!!!");
           
           for(Process x:process)
        	   x.task();
	}

}
