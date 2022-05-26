package com.oops;

public class Student {
   private int sno;
   private String name;
   private  String city;
   public Student() {
	   
   }
   
   public Student(int sno,String name,String city) {
	   this.sno=sno;
	   this.name=name;
	   this.city=city;
   }
   
   public void setStudent(int sno,String name,String city) {
	   this.sno = sno;
	   this.name = name;
	   this.city = city;
   }
   
   public void setStudent(int sno) {
	   this.sno =sno;
   }
   
   public void setStudent(String name,String city) {
	   this.name=name;
	   this.city=city;
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
                 
                 
          one name many forms
          
          method overloadin
          
          creating multiple methos with same name
          
          difference should be in terms of
          
          * number of parameters
          * order of parameters
          * type of parameters
          
show(int a, int b)
show(int b, int a) not valid

show(int a, float b)
show(float b, int a)
*/