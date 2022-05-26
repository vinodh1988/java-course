package com.oops;

public class Child extends Parent {
   private int childData;
   
   public Child(int childData) {
	   super(childData);
	   this.childData=childData;
   }
   
   public void showChild() {
	   System.out.println("childData"+childData);
   }
}
