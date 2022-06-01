package com.sample;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String n[]) {
        Set<Emp> set=new TreeSet<Emp>();
        set.add(new Emp(9,"Ravi","Mumbai"));
        set.add(new Emp(6,"Jay","Chennai"));
        set.add(new Emp(2,"Ramesh","Mumbai"));
        set.add(new Emp(4,"Naveen","Mumbai"));
        set.add(new Emp(3,"Harish","Panaji"));
        set.add(new Emp(8,"Rajan","Chenai"));
        System.out.println(set);
    }
}
