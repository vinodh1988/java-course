package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serialization {
   public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
          File f=new File("E:\\FileObject");
	    try(
	      FileOutputStream fout=new FileOutputStream(f);
	      ObjectOutputStream out=new ObjectOutputStream(fout);
	    ){
	      
	     while(true) {
	    	 System.out.println("About to create an Employee ");
	         System.out.println("Eno: ");
	         int sno=Integer.parseInt(sc.next());
	         if(sno<=0)
	        	 break;
	         System.out.println("Name: ");
	         String name=sc.next();
	         System.out.println("City: ");
	         String city=sc.next();
	         Emp emp=new Emp(sno,name,city);
	         out.writeObject(emp);
	            
	     }
	    }
	    catch(IOException e) {
	    	e.printStackTrace();
	    }
	     
    }
}
