package com.damian.DojoSurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurvey {
	@RequestMapping("/")
	public String index() {
		return ("index");
	}
	@RequestMapping(path="/data", method=RequestMethod.POST)
	public String data(HttpSession session, @RequestParam(value="name") String name, 
			@RequestParam(value="location") String location, 
			@RequestParam(value="language") String language, 
			@RequestParam(value="comment") String comment) {
		
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	@RequestMapping("/result")
	public String result(HttpSession session) {
		session.getAttribute("name");
		session.getAttribute("location");
		session.getAttribute("language");
		session.getAttribute("comment");
		return ("result");
	}
}
