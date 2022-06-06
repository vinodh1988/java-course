package com.system;

import org.springframework.beans.factory.annotation.Autowired;

public class Coding implements Activity {

@Autowired
	private Program program;
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
        System.out.println("Coding...!!!");
        program.writeCode();
	}

	
	{
		System.out.println("Coding..object created");
	}
}
