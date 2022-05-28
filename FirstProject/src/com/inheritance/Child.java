package com.inheritance;

public class Child extends Parent{
  Child(){
	  System.out.println("Child Class");
  }
  public void show() {
	  System.out.println("Child Show");
  }
  @Override
  public void display() {
	  super.display();
	  System.out.println("Child Display");
  }
}
