package com.sterling;

public class Ternary {
   public static void main(String n[]) {
	   int score=40;
	   String status = score>40? "Pass":"fail";
	   int stat = score>=35? 111:000; 
	   System.out.println(status);
	   System.out.println(stat);
   }
}
