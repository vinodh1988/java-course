package com.micro.app.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class AccessService {
  private int access;
  
  public void setAccess() {
	  access++ ;
  }
  
  public int getAccess() {
	  return access;
  }
}
