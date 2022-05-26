package com.oops;

public class Student {
   private int sno;
   private String name;
   private  String city;
   
   public void setStudent(int sno,String name,String city) {
	   this.sno = sno;
	   this.name = name;
	   this.city = city;
   }
   
   public void show() {
	   System.out.println("Sno:"+sno);
	   System.out.println("Name:"+name);
	   System.out.println("City:"+city);
   }
}


/*

   properties and functionalities
   
   Encapsulation - wrapping properties and functionalities 
   together
   
   abstract ion -- representing only the essential features..
                 hiding the background implementation.
*/