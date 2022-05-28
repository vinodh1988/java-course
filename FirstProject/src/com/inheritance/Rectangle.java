package com.inheritance;

public class Rectangle extends Shape {
     private int length;
     private int breadth;
     
     public Rectangle(String name,int sides,int length,int breadth) {
    	 super(name,sides);
    	 this.length=length;
    	 this.breadth = breadth;
     }
     
     public void area() {
    	 System.out.println("Area : "+ (length*breadth));
     }
     
     public void perimeter() {
    	 System.out.println("Perimeter: "+ (2*(length+breadth)));
     }
     public void display() {
    	 super.display();
    	 System.out.println("Length: "+length+" Breadth: "+breadth);
     }
}
