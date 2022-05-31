package com.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(53);
		set.add(null);
		set.add(53);
		set.add(24839);
		set.add(34);
		set.add(15);
		System.out.println(set);
		
		for(Integer x:set)
			System.out.println(x);
		
	    Iterator<Integer> i=set.iterator();
	    
	    while(i.hasNext())
	    	System.out.println("Element is -> "+i.next());
	}
}
