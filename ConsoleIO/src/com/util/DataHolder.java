package com.util;

public class DataHolder<T> {
  private T a;
  
  public DataHolder(T a) {
	  this.a =a ;
  }
  
  public void setA(T a) {
	  this.a=a;
  }
  
  public void show() {
	  System.out.println("a:: "+a);
	}
}
