package com.micro.app.services;

import org.springframework.stereotype.Service;

@Service
public class DataService {
   public String[] getNames() {
	   String[] p= {"Rajan","Rahu","Johnson","Christopher","Peter","Nixon","Jackson"};
	   return p;
   }
}
