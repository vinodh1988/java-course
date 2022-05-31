package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileReader {
   public static void main(String n[]) {
	   File f=new File("D:\\MyWork\\mypro.json");
	   File f1=new File("E:\\copied.json");
	
	   try(
			   FileReader in=new FileReader(f);
			   BufferedReader br=new BufferedReader(in)	;
			   FileWriter out=new FileWriter(f1);
			   BufferedWriter bw=new BufferedWriter(out);
		) {
		 String p=null;
		 while((p=br.readLine())!=null) {
			 System.out.println(p);
			 bw.write(p);
			 bw.newLine();
		 }
	} catch (NumberFormatException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
}
