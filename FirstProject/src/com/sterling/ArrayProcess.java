package com.sterling;

public class ArrayProcess {
   public static void main(String n[])
{
	    int[] set=new int [5];
	    
	    System.out.println(set);
	    
	    set[3]=345;
	    
	    for(int x:set)
	    	System.out.println(x);
	    
	    System.out.println(set.length);
	    
	    for(int i=0;i<set.length;i++)
	    	System.out.println(set[i]+" set["+i+"]");
  // collection of homogenous elements   
}

}