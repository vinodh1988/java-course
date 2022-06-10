package com.micro.app.utils;

public class RecordAlreadyExistsException extends Exception {
	
	public RecordAlreadyExistsException() {
		
	}
   
	public String getMessage() {
		return " Record Already Exists Exception ";
	}
}
