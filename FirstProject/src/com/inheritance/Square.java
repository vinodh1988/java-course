package com.inheritance;

public class Square extends Shape{
   private int side;
	public Square(String name,int sides,int side) {
		super(name,sides);
		this.side = side;
	}
	
	public void display() {
		super.display();
		System.out.println("Side: "+side);
	}
	
	public void area() {
		System.out.println("Area:"+ (side*side));
	}
	
	public void perimeter() {
		System.out.println("Perimeter: "+ (4*side));
	}
}
