package com.util;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
   public static void main(String n[]) {
	   List<String> list=new LinkedList<String>();
	   list.add("Ravi");
	   list.add("Ravi");
	   list.add(null);
	   list.add(null);
	   list.add("Jacob");
	   list.add("Navaj");
	   list.add("Ratan");
	   list.add("Bhairav");
	   
	   System.out.println(list);
	   
	   for(String x:list)
		   System.out.println(x);
	   
	   for(int i=0;i<list.size();i++)
		   System.out.println("list["+i+"] ->"+list.get(i));
	   
	   list.add(5,"Prathap");
	   System.out.println(list);
	   list.remove(5);
	   System.out.println(list);
	   
   }
}
