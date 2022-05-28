package com.inheritance;

abstract public class Shape {
   protected String name;
   protected int sides;
   
   public Shape() {}
   
   public Shape(String name,int sides) {
	   this.name=name;
	   this.sides=sides;
   }
   
   public void display() {
	   System.out.println("Name:: "+this.name+" Sides:: "+this.sides);
   }
   
   abstract public void area();
   abstract public void perimeter();
}
