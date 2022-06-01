package com.sample;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
   public static void main(String n[]) {
	   Map<String,String> m=new Hashtable<String,String>();
       m.put("Naveen", "Joseph");
       m.put("Bharat", "Chris");
       m.put("Sandeep", "John");
       m.put("Kashyap", "Prahladh");
       m.put("Praveen", "Joseph");
       m.put("Lokesh", "Prem");
       m.put("Shawn", "Jai");
       m.put("Naresh", "Chris");
       m.put("Shawn", "Joseph");
      // m.put(null, null);
//      // m.put("Anand", null);
       System.out.println(m);
       
       System.out.println(m.get("Anand"));
       
       for(String x:m.keySet())
    	   System.out.println(x+" - > "+m.get(x));
   }
}
