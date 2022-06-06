package com.store;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.system.Activity;

public class Main {
  public static void main(String[] args) {
	 // Activity a=new Coding();
	  ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
	 // ac.register(JavaConfig.class);
	 // ac.refresh();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter what activity you want to do coding/document/testing");
	  String choice = sc.next();
	  Activity a=(Activity)ac.getBean(choice);
	  a.perform();
  }
}
