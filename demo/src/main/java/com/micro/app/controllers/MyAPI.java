package com.micro.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.app.entity.Project;
import com.micro.app.services.DataService;
import com.micro.app.utils.RecordNotFoundException;

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
	
	@PostMapping("projects")
	public ResponseEntity<Project> addProject(@RequestBody Project pro){
		try {
			project.addProject(pro);
			return new ResponseEntity<Project>(pro,HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<Project>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/projects/{sno}")
	public ResponseEntity<String> deleteProject(@PathVariable("sno") Integer sno){
		try {
			project.delete(sno);
			return new ResponseEntity<String>("successfuly deleted",HttpStatus.OK);
		}
		catch(RecordNotFoundException e) {
			return new ResponseEntity<String>("No Record found",HttpStatus.NO_CONTENT);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
