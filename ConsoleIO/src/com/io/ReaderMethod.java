package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderMethod {
	 public static void main(String[] args) {
		   InputStreamReader in=new InputStreamReader(System.in);
		   BufferedReader br=new BufferedReader(in);
		  
		   try {
			   System.out.println("Enter Sno");
			int sno = Integer.parseInt(br.readLine());
			   System.out.println("Enter name");
			String name = br.readLine();
			 System.out.printf("%20d %20s", sno,name);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	   }
}
