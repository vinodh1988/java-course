package com.micro.app.utils;

public class RecordNotFoundException extends Exception{
	@Override
    public String getMessage() {
		return "No Record Found";
	}

}
