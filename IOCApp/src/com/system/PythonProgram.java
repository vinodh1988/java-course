package com.system;

import org.springframework.stereotype.Component;

@Component("python")
public class PythonProgram implements Program {

	@Override
	public void writeCode() {
		// TODO Auto-generated method stub
         System.out.println("Python Programming...!!!");
	}

}
