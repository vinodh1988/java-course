package com.util;

public class DataMain {
  public static void main(String[] args) {
	DataHolder<Integer> d=new DataHolder<Integer>(1);
	d.show();
	d.setA(234);
	d.show();
	
	DataHolder<String> s=new DataHolder<String>("Nicholas");
	s.show();
	s.setA("Naveen");
	s.show();
}
}
