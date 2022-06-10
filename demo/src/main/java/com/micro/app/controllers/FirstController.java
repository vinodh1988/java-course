package com.micro.app.controllers;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.micro.app.entity.Project;
import com.micro.app.services.AccessService;
import com.micro.app.services.DataService;
import com.micro.app.services.WholeAccess;

//@Controller
public class FirstController {
	{
		System.out.println("#instantiated");
	}
	@Autowired
	DataService service;
	
	@Autowired
	AccessService accessservice;
	
	@Autowired
	WholeAccess whole;
	
	@RequestMapping("/home.do")
	public String doThis(ModelMap p) {
		p.addAttribute("projects",service.getProjects());
		p.addAttribute("names",service.getNames());
		p.addAttribute("times",accessservice.getAccess());
		p.addAttribute("atimes",whole.getAccess());
		return "home";
	}
	
	 @RequestMapping("/project.do")
	 public ModelAndView people(ModelMap map) {
	
		return new ModelAndView("project","project",new Project());
				//ist paramater name of the view
				//2nd parameter name of the moduleAttribute
	 }
	 
	 
	 @RequestMapping(value="/store.do",method = RequestMethod.POST)
	 public String people(@ModelAttribute("project")Project project,ModelMap p) {
	        service.addProject(project);
	        accessservice.setAccess();
            whole.setAccess();
	        p.addAttribute("names",service.getNames());
	        p.addAttribute("atimes",whole.getAccess());
		    p.addAttribute("projects",service.getProjects());
		    p.addAttribute("times",accessservice.getAccess());
			return "home";
				//ist paramater name of the view
				//2nd parameter name of the moduleAttribute
	 }
	 
	 
	
}
*/