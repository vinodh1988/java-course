package com.micro.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micro.app.services.DataService;

@Controller
public class FirstController {
	{
		System.out.println("#instantiated");
	}
	@Autowired
	DataService service;
	@RequestMapping("/home.do")
	public String doThis(ModelMap p) {
		p.addAttribute("projects",service.getProjects());
		p.addAttribute("names",service.getNames());
		return "home";
	}
}
