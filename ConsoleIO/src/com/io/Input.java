package com.io;

import java.io.DataInputStream;
import java.io.IOException;

public class Input {
  public static void main(String[] args) {
	   DataInputStream d=new DataInputStream(System.in);
	  
	   try {
		   System.out.println("Enter Sno");
		int sno = Integer.parseInt(d.readLine());
		   System.out.println("Enter name");
		String name = d.readLine();
		 System.out.printf("%20d %20s", sno,name);
	} catch (NumberFormatException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
}
