package com.oops;

public class Parent {
   private int parentdata;
   
   public Parent() {
	   System.out.println("Parent default");
   }
   
   public Parent(int parentData) {
	   this.parentdata=parentData;
   }
   
   public void show() {
	   System.out.println("Parent "+parentdata);
   }
}
