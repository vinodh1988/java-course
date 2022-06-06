package com.system;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class TestCaseCreation implements Process {

	@Override
	public void task() {
		// TODO Auto-generated method stub
         System.out.println("Creating Test cases");
	}

}
