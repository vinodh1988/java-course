package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OtherfilesCopy {
    public static void main(String n[]) {
      File f=new File("D:\\MyWork\\apache-activemq-5.17.0\\activemq-all-5.17.0.jar");
      File f1=new File("E:\\activemq-all-5.17.0.jar");
      
      try(
    	  FileInputStream fi=new FileInputStream(f);
    	  FileOutputStream fo=new FileOutputStream(f1);
      ){
    	  byte[] b=new byte[(int)f.length()];
            fi.read(b);
            fo.write(b);
            System.out.println("File copied");
      }
      catch(IOException e){
         e.printStackTrace();
      }
}
}
