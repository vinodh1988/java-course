package com.def;

public class Packaging implements Task{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Processing packaging task");
	}
	
	@Override
	public void postProcess() {
		System.out.println("Post processing packaging");
	}

}
