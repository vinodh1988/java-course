package com.util;

import java.util.Stack;

public class StackDemo {
   public static void main(String[] args) {
	  Stack<String> s=new Stack<String>();
	   s.push("Ram");
	   s.push("Rajan");
	   s.push("Harry");
	   s.push("Joseph");
	   s.push("Vinsecent");
	   s.push("Nicholas");
	   System.out.println(s);
	   System.out.println(s.pop());
	   System.out.println(s.peek());
	   System.out.println(s);
   }
}  
