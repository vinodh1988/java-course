package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
   public static void main(String n[]) {
	   File f=new File("D:\\MyWork\\mypro.json");
	
	   try(
			   FileReader in=new FileReader(f);
			   BufferedReader br=new BufferedReader(in)	   
		) {
		 String p=null;
		 while((p=br.readLine())!=null)
			 System.out.println(p);
	} catch (NumberFormatException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
}
