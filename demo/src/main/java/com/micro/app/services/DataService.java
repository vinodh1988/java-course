package com.micro.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.app.entity.Project;
import com.micro.app.repositories.ProjectRepository;

@Service
public class DataService {
	
@Autowired
ProjectRepository repository;

   public String[] getNames() {
	   String[] p= {"Rajan","Rahu","Johnson","Christopher","Peter","Nixon","Jackson"};
	   return p;
   }
   
   public List<Project> getProjects(){
	   return repository.findAll();
   }
}
