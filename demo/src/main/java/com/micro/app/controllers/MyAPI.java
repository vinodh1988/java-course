package com.micro.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.app.entity.Project;
import com.micro.app.services.DataService;

@RestController
@RequestMapping("/api")
public class MyAPI {
 @Autowired
 DataService project;
	
	@GetMapping("/projects")
	public List<Project> getProjects(){
		return project.getProjects();
	}
	
	@GetMapping("/projects/{sno}")
	public Project getProject(@PathVariable("sno") Integer sno) {
		
		return project.getProject(sno);
	}
}
