package com.damian.portfolio.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index.html";
	}
	@RequestMapping("/projects")
	public String myProjects() {
		return "projects.html";
	}
	@RequestMapping("/about")
	public String aboutMe() {
		return "about.html";
	}
}
