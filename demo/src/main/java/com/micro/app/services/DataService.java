package com.micro.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.app.entity.Project;
import com.micro.app.repositories.ProjectRepository;
import com.micro.app.utils.RecordNotFoundException;

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
   
   public Project getProject(int sno) {
	   return repository.findByProjectno(sno);
   }
   public void addProject(Project p) {
	   repository.save(p);
   }
   
   public void delete(int sno) throws RecordNotFoundException {
	   Project p=repository.findByProjectno(sno);
	   if(p==null)
		   throw new RecordNotFoundException();
	   else
		   repository.delete(p);
   }
}
