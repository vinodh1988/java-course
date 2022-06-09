package com.micro.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.app.entity.Project;
import com.micro.app.repositories.ProjectRepository;

@RestController
@RequestMapping("/api")
public class MyAPI {
 @Autowired
 ProjectRepository project;
	
	@RequestMapping("/projects")
	public List<Project> getProjects(){
		return project.findAll();
	}
}
