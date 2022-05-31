package com.io;

import java.io.Serializable;

public class Emp implements Serializable{
   private int eno;
   private String name;
   private String city;
 public Emp() {} 
 public Emp(int eno, String name, String city) {
	super();
	this.eno = eno;
	this.name = name;
	this.city = city;
}
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Emp [eno=" + eno + ", name=" + name + ", city=" + city + "]";
}
 
 
   
   
}
