package com.system;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaProgram implements Program {

	@Override
	public void writeCode() {
		// TODO Auto-generated method stub
        System.out.println("Writing java Code");
	}

}
