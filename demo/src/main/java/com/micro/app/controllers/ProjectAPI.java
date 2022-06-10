package com.micro.app.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.micro.app.entity.Project;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
public interface ProjectAPI {
	@ApiOperation(value="list of Projects from table",response=Iterable.class)
	public List<Project> getProjects();
	@ApiOperation(value="Project based on Project no",response=Iterable.class)
	public Project getProject(@PathVariable("sno") Integer sno);
	@ApiOperation(value="Add the project in the database record",response=Iterable.class)
	public ResponseEntity<Project> addProject(@RequestBody Project pro);
	@ApiOperation(value="Delete the project",response=String.class)
	public ResponseEntity<String> deleteProject(@PathVariable("sno") Integer sno);
	
}
