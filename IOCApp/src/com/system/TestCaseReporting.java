package com.system;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class TestCaseReporting implements Process {

	@Override
	public void task() {
		// TODO Auto-generated method stub
        System.out.println("Reporting the test cases");
	}

}
