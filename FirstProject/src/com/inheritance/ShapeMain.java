package com.inheritance;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String n[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("What to do you want to process R for rectangle S for square");
    	String choice=sc.next();
    	Shape s=null;
        switch(choice) {
           case "R":
        	   s=new Rectangle("Rectangle",4,
        			   (int)Math.round(Math.random()*100),
        			   (int)Math.round(Math.random()*100));
        	
        	   break;
           case "S":
        	   s=new Square("Square",4,
        			   (int)Math.round(Math.random()*100));
        	
        	   break;
        	   
        }
     
 	   s.display();
 	   s.area();
 	   s.perimeter();
 	   
    }
}
