package com.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialRead {
    public static void main(String n[]) {
    	   File f=new File("E:\\FileObject");
    	try(
    	   FileInputStream fin=new FileInputStream(f);
    	   ObjectInputStream oin=new ObjectInputStream(fin);
    	){
    	    Emp e=null;		
    		while(true) {
    			e=(Emp)oin.readObject();
    			System.out.println(e);
    		}
    			
    	}
    	catch(EOFException e) {
    		System.out.println("Finished reading all records");
    	}
    	catch(IOException e) {
    		e.printStackTrace();
    	} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
}
