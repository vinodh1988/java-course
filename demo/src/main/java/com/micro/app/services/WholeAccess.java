package com.micro.app.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class WholeAccess {
	  private int access;
	  
	  public void setAccess() {
		  access++ ;
	  }
	  
	  public int getAccess() {
		  return access;
	  }
}
