package com.exceptions;

public class NotValidException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Not A Valid Name";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "NotValid Exception";
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}
  
	
}
