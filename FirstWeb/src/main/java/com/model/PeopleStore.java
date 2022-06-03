package com.model;

import java.util.ArrayList;
import java.util.List;

public class PeopleStore {
   public static List<Person> list =new ArrayList<Person>();
   
   public static void addPerson(Person p) {
	   list.add(p);
   }
   
   public static List<Person> getPeople(){
	   return list;
   }
}
