package com.sterling;

public class Datatypes {

public static void main(String n[]) {
  int a=20;
  int b=020; //octal number
  
  System.out.println(a);
  System.out.println(b);
  b=0220; // 2x64+2x8+0 ->144
  System.out.println(b);
  b=0x20; //16X2+0
  System.out.println(b);
  b=0x220;//2x256+2x16+0 ->544
  System.out.println(b);
  
  float c=34.53f; //by default any number with decimal points
                 //is treated as double
  System.out.println(c);
  
  int d=0131;  //0+1x8^2+1x8^1+1x8^0
               // 1x8^2+3x8^1+1x8^0
                 //64+24+1;
   System.out.println(d)    ;        
  boolean e=true;
  System.out.println(e);
  
  int l=89;
  
  System.out.printf("\n %o",l);
  System.out.printf("\n %x",l);//59
  
 // char d='D';
  //System.out.println(d);
}
}

/* 
  Primitive data types
  
  Integer
  
           long - 8 bytes
           int -4 bytes
           short - 2 bytes
           byte -1 byte
           
   float
          double -8 bytes
          float -4 bytes
          
   boolean 
          boolean - 1 bit
          
   character
   
           char - 2 bytes
                  [unicode]
                  
    String

*/