package com.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Coding implements Activity {

@Autowired
//@Qualifier("python")
	private Program python;
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
        System.out.println("Coding...!!!");
        python.writeCode();
	}

	
	{
		System.out.println("Coding..object created");
	}
}
