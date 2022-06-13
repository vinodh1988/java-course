package com.threads;

public class SampleMain {
   public static void main(String n[]) {
	   Shared s=new Shared();
	   JobThread j=new JobThread("Machine Job1",s);
	   JobThread j1=new JobThread("Machine Job2",s);
   }
}
