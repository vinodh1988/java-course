package com.inheritance;

public class MainClass {
   public static void main(String n[]) {
	   Parent p=new Child();
	   p.display();
	  // p.show();
	   p.print();
	   Child x=(Child)p;
	   x.show();
   }
}
