package com.system;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class TestExecution implements Process {

	@Override
	public void task() {
		// TODO Auto-generated method stub
       System.out.println("Running Test Cases");
	}

}
